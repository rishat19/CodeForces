package Tasks_0500;

import java.util.Scanner;

public class WrongSubtraction_977A {

    public static void main(String[] args) {
        task();
    }

    public static void task() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        for (int i = 0; i < k; i++) {
            if (n % 10 != 0) {
                n--;
            }
            else {
                n /= 10;
            }
        }
        System.out.print(n);
    }

}
