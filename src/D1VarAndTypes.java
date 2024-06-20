import java.util.Scanner;

public class D1VarAndTypes {
    public static void main(String[] args) {
        int a = 2;
        int b = 3;
        System.out.println(a + b);
        System.out.println(a);
        System.out.println(b);

        String line = "Hello Variables!";
        System.out.println(line);

        int thousand = 1000;

        // Có thể tạo tên giá trị trước
        int date;

        //Sau đó thêm giá trị cho tên đã tạo
        date = 10;

        // 1 dòng có thể tạo được nhiều giá trị biến số
        int month = 6, day = 20;
        System.out.println(month);
        System.out.println(day);

        // Quy tắc viết tên:
        // Chỉ viết bằng chữ sỗ là không dược
        // Không dử dụng được các kí hiệu đặc biệt
        // Dùng những từ ngữ trong Java đẻ gán biến số cũng không được

        // 실수자료형
        // long에 L처럼 float는 F를 붙여줘야 한다.
        float floatPoint = 2.718218F;
        // 대부분의 상화에서 double을 쓴다.
        double doublePoint = 3.1415926539111111111111111111;
        System.out.println(doublePoint);

        // 불린(boolean) 자료형
        boolean success = true;
        boolean fail = false;

        // 문자(char) 자료형
        char alphabet = 'a';
        System.out.println(alphabet);
        // 특수 상황 제외, 두글자 이상 사용 물가
        // char alphabet = "ab'; 오류 난다
        // 글자 1
        char digit = '1';

        // 문자열(String) 자료형
        // 기술적으로 char의 나열
        String word = "Hello";
        String world = "Hello World";
        String sentence = "this is a String varible";

        // 문자와 문자열의 차이
        // String letter = 'a'; // 오류
        String letter = "a";
        // char  charLetter = "a"; // 오류
        char charLetter = 'a';


        // Scanner 사용하기
        Scanner scanner = new Scanner(System.in);
        // scanner.nextLine()
        String inputLine = scanner.nextLine();
        System.out.println(inputLine);

        String inputLine1 = scanner.nextLine();
        String inputLine2 = scanner.nextLine();

        System.out.println(inputLine1);
        System.out.println(inputLine2);

        int inputA = scanner.nextInt();
        int inputB = scanner.nextInt();

        System.out.println(inputA);
        System.out.println(inputB);
        System.out.println(inputA + inputB);

        long inputLong = scanner.nextLong();

        int inputInteger = scanner.nextInt();
        String nextLine = scanner.nextLine();
        System.out.println(inputInteger);
        System.out.println(nextLine);
    }
}
