package d3.prob;

import java.util.Scanner;
/*
정수 n을 입력받아
10의 배수인지, 5의 배수인지, 2의 배수인지, 아니면 아무 숫자의 배수도 아닌지
출력하는 프로그램
 */
public class Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n % 10 == 0) {
            System.out.println("10의 배수");
        }
        else if (n % 5 == 0) {
            System.out.println("5의 배수");
        }
        else if (n % 2 == 0) {
            System.out.println("2의 배수");
        }
        else {
            System.out.println("not multiple of 10 nor 5 nor 2");
        }
    }
}