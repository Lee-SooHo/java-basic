package d3.prob;

import java.util.Scanner;

public class Qf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] names = new String[3];
        for (int i = 0; i < 3; i++) {
            names[i] = scanner.nextLine();
        }
        int[] temps = new int[3];
        for (int i = 0; i < 3; i++) {
            temps[i] = scanner.nextInt();
        }

        for (int i = 0; i < 3; i++) {
            if (temps[i] >= 38) {
                System.out.println(names[i]);
            }
        }
    }
}
