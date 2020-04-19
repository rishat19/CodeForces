package Tasks_1100;

import java.util.Scanner;
import java.util.TreeMap;

public class TwoTeamsComposing_1335C {

    public static void main(String[] args) {
        task();
    }

    public static void task() {
        Scanner scanner = new Scanner(System.in);
        TreeMap<Integer, Integer> map = new TreeMap<>();
        int t = scanner.nextInt();
        int n, a, same, different, l, answer;
        for (int i = 0; i < t; i++) {
            n = scanner.nextInt();
            for (int j = 0; j < n; j++) {
                a = scanner.nextInt();
                if (map.containsKey(a)) {
                    map.put(a, map.get(a) + 1);
                }
                else {
                    map.put(a, 1);
                }
            }
            same = map.size();
            different = 0;
            while (map.size() > 0) {
                l = map.pollFirstEntry().getValue();
                if (l > different) {
                    different = l;
                }
            }
            if (same > different) {
                same--;
            }
            else {
                different--;
            }
            answer = Integer.min(same, different);
            System.out.print(answer + "\n");
        }
    }

}
