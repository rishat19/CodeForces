package Tasks_1200;

import java.util.Scanner;
import java.util.TreeSet;

public class VanyaAndLanterns_492B {

    public static void main(String[] args) {
        task();
    }

    public static void task() {
        Scanner scanner = new Scanner(System.in);
        TreeSet<Integer> set = new TreeSet<>();
        int n = scanner.nextInt();
        int l = scanner.nextInt();
        int maxSegment = 0;
        for (int i = 0; i < n; i++) {
            set.add(scanner.nextInt());
        }
        int prev = 0;
        for (Integer a : set) {
            if (a - prev > maxSegment) {
                maxSegment = a - prev;
            }
            prev = a;
        }
        double firstSegment = set.first();
        double lastSegment = l - set.last();
        double d = (double) maxSegment / 2;
        if (d < firstSegment) {
            d = firstSegment;
        }
        if (d < lastSegment) {
            d = lastSegment;
        }
        System.out.println(d);
    }

}
