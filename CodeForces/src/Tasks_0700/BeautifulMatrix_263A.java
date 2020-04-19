package Tasks_0700;

import java.util.Scanner;

public class BeautifulMatrix_263A {

    public static void main(String[] args) {
        System.out.print(task());
    }

    public static int task() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (scanner.nextInt() == 1) {
                    return Math.abs(2 - i) + Math.abs(2 - j);
                }
            }
        }
        return 0;
    }

}
