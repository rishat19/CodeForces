package Tasks_1600;

import java.util.Arrays;
import java.util.Scanner;

public class ChainReaction_607A {

    public static void main(String[] args) {
        task();
    }

    public static void task() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Pair[] array = new Pair[n];
        for (int i = 0; i < n; i++) {
            array[i] = new Pair(scanner.nextInt(), scanner.nextInt());
        }
        Arrays.sort(array);
        int[] notDestroy = new int[n];
        notDestroy[0] = 1;
        for (int i = 1; i < n; i++) {
            notDestroy[i] = 1;
            int k = Arrays.binarySearch(array, new Pair(array[i].a - array[i].b, -42));
            if (k < 0) {
                k = -k - 1;
            }
            if (k > 0) {
                notDestroy[i] += notDestroy[k - 1];
            }
        }
        int maxNotDestroy = notDestroy[0];
        for (int i = 1; i < n; i++) {
            if (notDestroy[i] > maxNotDestroy) {
                maxNotDestroy = notDestroy[i];
            }
        }
        System.out.print(n - maxNotDestroy);
    }

    private static class Pair implements Comparable<Pair> {
        private int a;
        private int b;
        private Pair(int a, int b) {
            this.a = a;
            this.b = b;
        }
        @Override
        public int compareTo(Pair o) {
            return a - o.a;
        }
    }

}
