package Tasks_1300;

import java.util.Scanner;

public class KthBeautifulString_1328B {

    public static void main(String[] args) {
        task();
    }

    public static void task() {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        long n, k;
        for (int i = 0; i < t; i++) {
            n = scanner.nextLong();
            k = scanner.nextLong();
            printString(n, k);
        }
    }

    public static void printString(long n, long k) {
        long numberOfStrings = n * (n - 1) / 2;
        if (k <= numberOfStrings - n + 1) {
            System.out.print('a');
            printString(n - 1, k);
        }
        else {
            System.out.print('b');
            k = k - numberOfStrings + n - 1;
            for (int i = 0; i < n - 1 - k; i++) {
                System.out.print('a');
            }
            System.out.print('b');
            for (int i = 0; i < k - 1; i++) {
                System.out.print('a');
            }
            System.out.print('\n');
        }
    }

}
