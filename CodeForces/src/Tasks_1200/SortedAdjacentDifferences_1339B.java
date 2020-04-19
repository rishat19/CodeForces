package Tasks_1200;

import java.util.Arrays;
import java.util.Scanner;

public class SortedAdjacentDifferences_1339B {

    public static void main(String[] args) {
        task();
    }

    public static void task() {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        int n;
        int[] a;
        for (int i = 0; i < t; i++) {
            n = scanner.nextInt();
            a = new int[n];
            for (int j = 0; j < n; j++) {
                a[j] = scanner.nextInt();
            }
            Arrays.sort(a);
            if (n % 2 == 0) {
                for (int j = 0; j < n / 2; j++) {
                    System.out.print(a[n / 2 - j - 1] + " " + a[n / 2 + j] + " ");
                }
            }
            else {
                System.out.print(a[n / 2] + " ");
                for (int j = 0; j < n / 2; j++) {
                    System.out.print(a[n / 2 - j - 1] + " " + a[n / 2 + j + 1] + " ");
                }
            }
        }
    }

}
