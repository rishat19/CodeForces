package Tasks_0600;

import java.util.Arrays;
import java.util.Scanner;

public class RestoringThreeNumbers_1154A {

    public static void main(String[] args) {
        task();
    }

    public static void task() {
        Scanner scanner = new Scanner(System.in);
        int[] a = new int[4];
        for (int i = 0; i < a.length; i++) {
            a[i] = scanner.nextInt();
        }
        Arrays.sort(a);
        for (int i = 0; i < a.length - 1; i++) {
            System.out.print(a[3] - a[i] + " ");
        }
    }

}
