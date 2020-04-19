package Tasks_0900;

import java.util.Arrays;
import java.util.Scanner;

public class FastFoodRestaurant_1313A {

    public static void main(String[] args) {
        task();
    }

    public static void task() {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        int count;
        int[] a = new int[3];
        for (int i = 0; i < t; i++) {
            count = 0;
            a[0] = scanner.nextInt();
            a[1] = scanner.nextInt();
            a[2] = scanner.nextInt();
            Arrays.sort(a);
            if (a[2] > 0) {
                a[2]--;
                count++;
            }
            if (a[1] > 0) {
                a[1]--;
                count++;
            }
            if (a[0] > 0) {
                a[0]--;
                count++;
            }
            if (a[2] > 0 && a[1] > 0) {
                a[2]--;
                a[1]--;
                count++;
            }
            if (a[2] > 0 && a[0] > 0) {
                a[2]--;
                a[0]--;
                count++;
            }
            if (a[1] > 0 && a[0] > 0) {
                a[1]--;
                a[0]--;
                count++;
            }
            if (a[2] > 0 && a[1] > 0 && a[0] > 0) {
                count++;
            }
            System.out.print(count + "\n");
        }
    }

}
