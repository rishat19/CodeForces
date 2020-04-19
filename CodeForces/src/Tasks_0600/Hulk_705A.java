package Tasks_0600;

import java.util.Scanner;

public class Hulk_705A {

    public static void main(String[] args) {
        task();
    }

    public static void task() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        boolean flag = false;
        for (int i = 0; i < n - 1; i++) {
            if (flag) {
                System.out.print("I love that ");
            }
            else {
                System.out.print("I hate that ");
            }
            flag = !flag;
        }
        if (flag) {
            System.out.print("I love it");
        }
        else {
            System.out.print("I hate it");
        }
    }
}
