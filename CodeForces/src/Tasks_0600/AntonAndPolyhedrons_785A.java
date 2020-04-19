package Tasks_0600;

import java.util.Scanner;

public class AntonAndPolyhedrons_785A {

    public static void main(String[] args) {
        task();
    }

    public static void task() {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.next());
        int answer = 0;
        String str;
        for (int i = 0; i < n; i++) {
            str = scanner.next();
            switch (str) {
                case "Tetrahedron":
                    answer += 4;
                    break;
                case "Cube":
                    answer += 6;
                    break;
                case "Octahedron":
                    answer += 8;
                    break;
                case "Dodecahedron":
                    answer += 12;
                    break;
                default:
                    answer += 20;
                    break;
            }
        }
        System.out.print(answer);
    }

}
