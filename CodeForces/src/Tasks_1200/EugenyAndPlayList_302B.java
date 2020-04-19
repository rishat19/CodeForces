package Tasks_1200;

import java.util.Scanner;

public class EugenyAndPlayList_302B {

    public static void main(String[] args) {
        task();
    }

    public static void task() {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[scanner.nextInt()];
        int m = scanner.nextInt();
        int term = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = term + scanner.nextInt() * scanner.nextInt();
            term = array[i];
        }
        int result;
        for (int i = 0; i < m; i++) {
            result = myBinarySearch(array, 0, array.length, scanner.nextInt()) + 1;
            System.out.print(result + "\n");
        }
    }

    public static int myBinarySearch(int[] array, int left, int right, int key) {
        int l = left;
        int r = right - 1;
        if (key > array[r]) {
            return r + 1;
        }
        if (key <= array[l]) {
            return l;
        }
        while (l <= r) {
            int guess = (l + r) / 2;
            if (array[guess] < key && key <= array[guess + 1]) {
                return guess + 1;
            }
            if (key <= array[guess]) {
                r = guess - 1;
            }
            else {
                l = guess + 1;
            }
        }
        return 0;
    }

}
