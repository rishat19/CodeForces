package Tasks_1000;

import java.util.Scanner;

public class LuckyDivision_122A {

    public static void main(String[] args) {
        task();
    }

    public static void task() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n % 4 == 0) {
            System.out.print("YES");
        }
        else if (n % 7 == 0) {
            System.out.print("YES");
        }
        else if (n % 47 == 0) {
            System.out.print("YES");
        }
        else if (n % 74 == 0) {
            System.out.print("YES");
        }
        else if (n % 447 == 0) {
            System.out.print("YES");
        }
        else if (n % 474 == 0) {
            System.out.print("YES");
        }
        else if (n % 477 == 0) {
            System.out.print("YES");
        }
        else if (n == 747) {
            System.out.print("YES");
        }
        else if (n == 774) {
            System.out.print("YES");
        }
        else {
            System.out.print("NO");
        }
    }

}
