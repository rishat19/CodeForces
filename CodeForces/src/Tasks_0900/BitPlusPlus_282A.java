package Tasks_0900;

import java.util.Scanner;

public class BitPlusPlus_282A {

    public static void main(String[] args) {
        task();
    }

    public static void task() {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.next());
        int x = 0;
        String str;
        for (int i = 0; i < n; i++) {
            str = scanner.next();
            if (str.charAt(0) == '-' || str.charAt(str.length() - 1) == '-') {
                x--;
            }
            else {
                x++;
            }
        }
        System.out.print(x);
    }

}
