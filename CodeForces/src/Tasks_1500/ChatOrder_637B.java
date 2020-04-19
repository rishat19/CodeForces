package Tasks_1500;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;

public class ChatOrder_637B {

    public static void main(String[] args) {
        task();
    }

    public static void task() {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.next());
        ArrayList<String> array = new ArrayList<>();
        TreeSet<String> set = new TreeSet<>();
        String name;
        for (int i = 0; i < n; i++) {
            name = scanner.next();
            array.add(name);
            set.add(name);
        }

        for (int i = array.size() - 1; i >= 0 && set.size() > 0; i--) {
            name = array.get(i);
            if (set.contains(name)) {
                System.out.print(name + "\n");
                set.remove(name);
            }
        }

    }

}
