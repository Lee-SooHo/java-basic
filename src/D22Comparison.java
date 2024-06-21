public class D22Comparison {
    public static void main(String[] args) {
        // Phép tính so sánh

        int small1 = 10;
        int small2 = 10;
        int big = 21;
        // true
        System.out.println(small1 == small2);
        // false
        System.out.println(small1 == big);
        // Không giống nhau? // false
        System.out.println(small1 != small2);
        // true
        System.out.println(big != small1);
        // Sự vượt quá
        System.out.println(big > small1); // true
        System.out.println(small2 > small1); // false
        // Dưới, chưa đến
        System.out.println(big < small1);  // false
        System.out.println(small2 < big);  // true
        // Trở lên
        System.out.println(big >= small1);    // true
        System.out.println(small1 >= small2); // true
        // Trở xuống
        System.out.println(big <= small1);    // false
        System.out.println(small1 <= small2); // true

        int base = 12;
        int num = 3;
        // base가 num의 배수인가?
        System.out.println(base % num == 0);

        int[] scores = {10, 9, 8};
        // 점수의 평균이 8.5보다 큰가?
        int sum = scores[0] + scores[1] + scores[2];
        double avg = (double) sum / 3;
        System.out.println(avg > 8.5);

        // Toán tử lô-gíc
        //
        int temperature = 36;
        int age = 25;

        //
        System.out.println(temperature <= 37);
        System.out.println(age >= 20);
        //
        System.out.println(temperature <= 37 && age >= 20);

        boolean notStick = temperature <= 37;
        boolean isOfAge = age >= 20;
        //
        //
        System.out.println(notStick && isOfAge);

        // OR 연산 (||)
        boolean isSunday = false;
        boolean isHoliday = false;
        boolean canRest = isSunday || isHoliday;
        System.out.println(canRest);

        // NOT 연산 (!)
        System.out.println(!canRest);

        // ! -> && -> ||
        boolean a = true;
        boolean b = false;
        boolean c = false;
        System.out.println(a && !b);
        System.out.println(!(b || c));
        System.out.println(c || b && a || c);
        System.out.println(a && b || a && c);
    }
}
