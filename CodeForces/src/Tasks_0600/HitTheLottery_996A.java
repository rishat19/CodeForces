package Tasks_0600;

import java.util.Scanner;

public class HitTheLottery_996A {

    public static void main(String[] args) {
        task();
    }

    public static void task() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int count = 0;
        count += n / 100;
        n = n % 100;
        count += n / 20;
        n = n % 20;
        count += n / 10;
        n = n % 10;
        count += n / 5;
        n = n % 5;
        count += n;
        System.out.print(count);
    }

}
