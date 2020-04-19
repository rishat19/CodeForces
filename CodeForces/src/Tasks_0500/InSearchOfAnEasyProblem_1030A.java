package Tasks_0500;

import java.util.Scanner;

public class InSearchOfAnEasyProblem_1030A {

    public static void main(String[] args) {
        task();
    }

    public static void task () {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        boolean flag = false;
        for (int i = 0; i < n && !flag; i++) {
            if (scanner.nextInt() == 1) {
                flag = true;
            }
        }
        if (flag) {
            System.out.print("HARD");
        }
        else {
            System.out.print("EASY");
        }
    }

}
