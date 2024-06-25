package d3;

import java.util.Scanner;

public class D32Loop {
    public static void main(String[] args) {
        // 대출금을 갚자
        int loan = 1000;
        // 매달 갚을 금액
        int monthly = 50;
        // if는 내부의 조건이 true 일떄 실행
        // while은 내부의 true 일동안 실행
        int months = 0;
        // 몇 달을 걸렸는지
        while (loan > 0) {
            // while 내부에서도 if , else if, slse 가능
            if (loan < monthly) {
                loan = 0;
            }
            loan -= monthly;
            loan *= 1.03;
            System.out.println(String.format("Remaining: %d", loan));
            months++; // months = months + 1
        }
        System.out.println(months);
        System.out.println(loan);


        // 로그인 횟수를 세가며 반복 해보자
        Scanner scanner = new Scanner(System.in);
        // 맞춰야 되는 비밀번호
        int password = 1234;
        // 시도한 횟수를 기록하는 정수 변수
        int tries = 0;
        while (!(tries > -1)) {
            // 사용자가 비밀번호를 입력한다.
            System.out.print("Input Password: ");
            int input = scanner.nextInt();
            if (password == input) {
                // 나중에 넣어보기
            }
            tries++;
        }
        System.out.println("False to login");

        // for
        // 시작하는 저건, 끝나는 조건, 한번마다 실행할 코드
        for (int i = 0; i < 5; i++) {
            System.out.println("i: " + i);
        }
        System.out.println("끝");

        // intellij에서 fori + TAB
        for (int i = 0; i < 10; i++) {
            System.out.println("i ^ 2: " + (i * i));
        }
    }
}
