package Tasks_1200;

import java.util.Scanner;
import java.util.TreeSet;

public class PolandBallAndGame_755B {

    public static void main(String[] args) {
        task();
    }

    public static void task() {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.next());
        int m = Integer.parseInt(scanner.next());
        TreeSet<String> set1 = new TreeSet<>();
        TreeSet<String> set2 = new TreeSet<>();
        boolean result = false;
        for (int i = 0; i < n; i++) {
            set1.add(scanner.next());
        }
        String word;
        for (int i = 0; i < m; i++) {
            word = scanner.next();
            if (set1.contains(word)) {
                set1.remove(word);
                result = !result;
            }
            else {
                set2.add(word);
            }
        }
        if (set1.size() > set2.size()) {
            System.out.print("YES");
        }
        else if (set1.size() < set2.size()) {
            System.out.print("NO");
        }
        else {
            if (result) {
                System.out.print("YES");
            }
            else {
                System.out.print("NO");
            }
        }
    }

}
