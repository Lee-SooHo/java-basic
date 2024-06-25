package d3.prob;

import java.util.Scanner;
/*
정수 N이 입력된 뒤, N개의 정수가 입력된다.
그 값들의 평균을 실수 범위에서 구하여라.
 */

public class Qd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += scanner.nextInt();
        }
        System.out.println((double)sum / n);
    }
}
