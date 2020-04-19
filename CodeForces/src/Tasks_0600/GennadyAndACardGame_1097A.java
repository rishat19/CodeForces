package Tasks_0600;

import java.util.Scanner;

public class GennadyAndACardGame_1097A {

    public static void main(String[] args) {
        if (task()) {
            System.out.print("YES");
        }
        else {
            System.out.print("NO");
        }
    }

    public static boolean task() {
        Scanner scanner = new Scanner(System.in);
        String card = scanner.next();
        char suit = card.charAt(0);
        char rank = card.charAt(1);
        for (int i = 0; i < 5; i++) {
            card = scanner.next();
            if (card.charAt(0) == suit || card.charAt(1) == rank) {
                return true;
            }
        }
        return false;
    }

}
