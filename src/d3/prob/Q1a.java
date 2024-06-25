package d3.prob;

import java.util.Scanner;

public class Q1a {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n < 0) {
            System.out.println("negative");
        } else if (n > 0) {
            System.out.println("positive");
        } else {
            System.out.println(0);
        }
    }
}
