package Tasks_1000;

import java.util.Scanner;

public class KanaAndDragonQuestGame_1337B {

    public static void main(String[] args) {
        task();
    }

    public static void task() {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            boolean flag = false;
            int x = scanner.nextInt();
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            while (x >= 39 && n > 0) {
                x = x / 2 + 10;
                n--;
                if (x <= 0) {
                    flag = true;
                    break;
                }
            }
            while (n >= 0 && !flag) {
                if (x - 10 * m <= 0) {
                    flag = true;
                    break;
                }
                x = x / 2 + 10;
                n--;
            }
            if (flag) {
                System.out.print("YES" + "\n");
            }
            else {
                System.out.print("NO" + "\n");
            }
        }
    }

}
