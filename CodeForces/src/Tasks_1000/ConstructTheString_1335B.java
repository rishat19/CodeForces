package Tasks_1000;

import java.util.Scanner;

public class ConstructTheString_1335B {

    public static void main(String[] args) {
        task();
    }

    public static void task() {
        char letter = 'a';
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        int n, a, b, k;
        for (int i = 0; i < t; i++) {
            n = scanner.nextInt();
            a = scanner.nextInt();
            b = scanner.nextInt();
            k = 0;
            for (int j = 0; j < n; j++) {
                if (k < (a - b + 1)) {
                    System.out.print(letter);
                    k++;
                }
                else if (k < a) {
                    System.out.print((char) (letter + (k - a + b)));
                    k++;
                }
                else {
                    System.out.print(letter);
                    k = 1;
                }
            }
            System.out.print("\n");
        }
    }

}
