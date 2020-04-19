package Tasks_0800;

import java.util.HashSet;
import java.util.Scanner;

public class CopyCopyCopyCopyCopy_1325B {

    public static void main(String[] args) {
        task();
    }

    public static void task() {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        int n;
        HashSet<Integer> set;
        for (int i = 0; i < t; i++) {
            n = scanner.nextInt();
            set = new HashSet<>();
            for (int j = 0; j < n; j++) {
                set.add(scanner.nextInt());
            }
            System.out.print(set.size() + "\n");
        }
    }

}
