package d3.prob;

import java.util.Scanner;
/*
한 정수를 입력받는다.
이후 이 정수를 거듭제곱하며 1의 자리를 확인하면서,
몇번 거듭제곱 했을 때 다시 원래의 숫자의 1의 자리랑 일치하는지 출력하여라.
한번만 거듭제곱해도 본래 숫자가 되면 결과는 1이다.
 */

public class Qh {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int base = n % 10;
        int now = base;
        int count = 0;
        while (true) {
            now *= base;
            now %= 10;
            count++;
            if (now == base) {
                break;
            }
        }
        System.out.println(count);
    }
}
