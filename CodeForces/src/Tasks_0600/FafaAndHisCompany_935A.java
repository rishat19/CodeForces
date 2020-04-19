package Tasks_0600;

import java.util.Scanner;

public class FafaAndHisCompany_935A {

    public static void main(String[] args) {
        task();
    }

    public static void task() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int count = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                count++;
            }
        }
        System.out.print(count);
    }

}
