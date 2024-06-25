package d3.prob;

import java.util.Scanner;

/*
정수 N이 입력된 뒤, N개의 이름이 개행을 기준으로 입력된다.
N개의 이름을 입력된 순서의 반대로 출력하여라.
 */
public class Qe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String[] names = new String[n];
        scanner.nextLine();
        for (int i = 0; i < n; i++) {
            names[i] = scanner.nextLine();
        }
        for (int i = 0; i < n; i++) {
            System.out.println(names[n - i - 1]);
        }
        System.out.println("-------");
        for (int i = n -1; i >= 0; i--) {
            System.out.println(names[i]);
        }
    }
}
