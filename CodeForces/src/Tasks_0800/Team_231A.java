package Tasks_0800;

import java.util.Scanner;

public class Team_231A {

    public static void main(String[] args) {
        task();
    }

    public static void task() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int j = 0;
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (scanner.nextInt() == 1) {
                j++;
            }
            if (scanner.nextInt() == 1) {
                j++;
            }
            if (scanner.nextInt() == 1) {
                j++;
            }
            if (j > 1) {
                count++;
            }
            j = 0;
        }
        System.out.print(count);
    }

}
