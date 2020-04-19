package Tasks_1100;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class InterestingDrink_706B {

    public static void main(String[] args) {
        task();
    }

    public static void task() {
        Scanner scanner = new Scanner(System.in);
        Integer[] array = new Integer[scanner.nextInt()];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        Arrays.sort(array, Collections.reverseOrder());
        int n = scanner.nextInt();
        int result;
        for (int i = 0; i < n; i++) {
            result = array.length - myBinarySearch(array, 0, array.length, scanner.nextInt());
            System.out.print(result + "\n");
        }
    }

    public static int myBinarySearch(Integer[] array, int left, int right, int key) {
        int l = left;
        int r = right - 1;
        if (key < array[r]) {
            return r + 1;
        }
        if (key >= array[l]) {
            return l;
        }
        while (l <= r) {
            int guess = (l + r) / 2;
            if (array[guess] > key && key >= array[guess + 1]) {
                return guess + 1;
            }
            if (key >= array[guess]) {
                r = guess - 1;
            }
            else {
                l = guess + 1;
            }
        }
        return 0;
    }

}
