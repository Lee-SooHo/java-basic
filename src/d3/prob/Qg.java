package d3.prob;

import java.util.Scanner;

public class Qg {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int bank = scanner.nextInt();
        while (true) {
            int withdraw = scanner.nextInt();
            if (withdraw > bank) {
                System.out.println("잔고가 부족합니다.");
                break;
            }
            bank -= withdraw;
            System.out.println(String.format("성공: %d", bank));
        }
    }
}
