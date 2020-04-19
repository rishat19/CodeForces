package Tasks_0900;

import java.util.Scanner;

public class PetyaAndStrings_112A {

    public static void main(String[] args) {
        task();
    }

    public static void task() {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.next().toLowerCase();
        String str2 = scanner.next().toLowerCase();
        int answer = str1.compareTo(str2);
        if (answer != 0) {
            answer /= Math.abs(answer);
        }
        System.out.print(answer);
    }

}
