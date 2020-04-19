package Tasks_0700;

import java.util.Scanner;

public class Elephant_617A {

    public static void main(String[] args) {
        task();
    }

    public static void task() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int steps = 0;
        steps += n / 5;
        n %= 5;
        if (n > 0) {
            steps++;
        }
        System.out.print(steps);
    }

}
