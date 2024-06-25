package d3.prob;

import java.util.Scanner;

public class Q3a {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int temperature = scanner.nextInt();
        if (temperature >= 38) {
            String sym = scanner.nextLine();
            System.out.println(String.format("%d, %s", temperature, sym));
        }
        else {
            System.out.println(temperature);
        }
    }
}
