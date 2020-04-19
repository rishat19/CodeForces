package Tasks_0800;

import java.util.Scanner;

public class CandiesAndTwoSisters_1335A {

    public static void main(String[] args) {
        task();
    }

    public static void task() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k;
        for (int i = 0; i < n; i++) {
            k = scanner.nextInt();
            System.out.print(((k - 1)/ 2) + "\n");
        }
    }

}
