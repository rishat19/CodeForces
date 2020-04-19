package Tasks_1300;

import java.util.Scanner;

public class AntiSudoku_1335D {

    public static void main(String[] args) {
        task();
    }

    public static void task() {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        int[] str = new int[9];
        int[] a = new int[9];
        for (int i = 0; i < t; i++) {
            for (int j = 0; j < 9; j++) {
                str[j] = scanner.nextInt();
            }
            a[0] = (str[0] % 1000000000 - str[0] % 100000000) / 100000000;
            if (a[0] == 9) {
                str[0] = str[0] - 100000000;
            }
            else {
                str[0] = str[0] + 100000000;
            }
            a[3] = (str[3] % 100000000 - str[3] % 10000000) / 10000000;
            if (a[3] == 9) {
                str[3] = str[3] - 10000000;
            }
            else {
                str[3] = str[3] + 10000000;
            }
            a[6] = (str[6] % 10000000 - str[6] % 1000000) / 1000000;
            if (a[6] == 9) {
                str[6] = str[6] - 1000000;
            }
            else {
                str[6] = str[6] + 1000000;
            }
            a[1] = (str[1] % 1000000 - str[1] % 100000) / 100000;
            if (a[1] == 9) {
                str[1] = str[1] - 100000;
            }
            else {
                str[1] = str[1] + 100000;
            }
            a[4] = (str[4] % 100000 - str[4] % 10000) / 10000;
            if (a[4] == 9) {
                str[4] = str[4] - 10000;
            }
            else {
                str[4] = str[4] + 10000;
            }
            a[7] = (str[7] % 10000- str[7] % 1000) / 1000;
            if (a[7] == 9) {
                str[7] = str[7] - 1000;
            }
            else {
                str[7] = str[7] + 1000;
            }
            a[2] = (str[2] % 1000- str[2] % 100) / 100;
            if (a[2] == 9) {
                str[2] = str[2] - 100;
            }
            else {
                str[2] = str[2] + 100;
            }
            a[5] = (str[5] % 100 - str[5] % 10) / 10;
            if (a[5] == 9) {
                str[5] = str[5] - 10;
            }
            else {
                str[5] = str[5] + 10;
            }
            a[8] = str[8] % 10;
            if (a[8] == 9) {
                str[8] = str[8] - 1;
            }
            else {
                str[8] = str[8] + 1;
            }
            for (int j = 0; j < 9; j++) {
                System.out.print(str[j] + "\n");;
            }
        }
    }

}
