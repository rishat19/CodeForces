package Tasks_1200;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Megacity_474B {

    public static void main(String[] args) {
        task();
    }

    public static void task() {
        Scanner scanner = new Scanner(System.in);
        TreeMap<Integer, Integer> map = new TreeMap<>();
        int n = scanner.nextInt();
        int s = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            int k = scanner.nextInt();
            int r = x * x + y * y;
            if (map.containsKey(r)) {
                k += map.get(r);
            }
            map.put(r, k);
        }
        int radiusSquared = 0;
        while (s < 1000000 && map.size() > 0) {
            radiusSquared = 0;
            Map.Entry<Integer, Integer> entry = map.firstEntry();
            s += entry.getValue();
            radiusSquared += entry.getKey();
            map.remove(entry.getKey());
        }
        if (s >= 1000000) {
            System.out.println(Math.sqrt(radiusSquared));
        }
        else {
            System.out.println(-1);
        }
    }
}
