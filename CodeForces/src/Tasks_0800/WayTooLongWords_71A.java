package Tasks_0800;

import java.util.Scanner;

public class WayTooLongWords_71A {

    public static void main(String[] args) {
        task();
    }

    public static void task() {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.next());
        String str;
        for (int i = 0; i < n; i++) {
            str = scanner.next();
            if (str.length() > 10) {
                System.out.print(str.charAt(0));
                System.out.print(str.length() - 2);
                System.out.print(str.charAt(str.length() - 1) + "\n");
            }
            else {
                System.out.print(str + "\n");
            }
        }
    }

}
