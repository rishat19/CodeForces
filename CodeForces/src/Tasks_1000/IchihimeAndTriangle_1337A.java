package Tasks_1000;

import java.util.Scanner;

public class IchihimeAndTriangle_1337A {

    public static void main(String[] args) {
        task();
    }

    public static void task() {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            int d = scanner.nextInt();
            System.out.print(b + " ");
            System.out.print(c + " ");
            System.out.print(c + "\n");
        }
    }

}
