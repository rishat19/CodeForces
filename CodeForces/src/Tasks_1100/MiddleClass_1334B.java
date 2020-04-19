package Tasks_1100;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class MiddleClass_1334B {

    public static void main(String[] args) {
        task();
    }

    public static void task() {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        int n, x, count;
        long sum;
        Integer[] a;
        for (int i = 0; i < t; i++) {
            n = scanner.nextInt();
            x = scanner.nextInt();
            sum = 0;
            count = n;
            a = new Integer[n];
            for (int j = 0; j < n; j++) {
                a[j] = scanner.nextInt();
            }
            Arrays.sort(a, Collections.reverseOrder());
            for (int j = 0; j < n; j++) {
                sum += a[j];
                if (sum < (long) x * (long) (j + 1)) {
                    count = j;
                    break;
                }
            }
            System.out.print(count + "\n");
        }
    }

}
