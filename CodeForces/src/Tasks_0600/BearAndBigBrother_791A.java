package Tasks_0600;

import java.util.Scanner;

public class BearAndBigBrother_791A {

    public static void main(String[] args) {
        task();
    }

    public static void task() {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int years = 0;
        while (a <= b) {
            a *= 3;
            b *= 2;
            years++;
        }
        System.out.print(years);
    }

}
