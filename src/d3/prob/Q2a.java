package d3.prob;

import java.util.Scanner;

public class Q2a {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int unit = scanner.nextInt();
        int length = scanner.nextInt();

        if (unit == 0) {
            double converted = length / 2.54;
            System.out.println(String.format("%.2f", converted));
        }
        else if (unit == 1){
            double converted = length * 2.54;
            System.out.println(String.format("%.2f%", converted));
        }
    }
}
