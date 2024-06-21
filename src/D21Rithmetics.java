public class D21Rithmetics {
    public static void main(String[] args) {
        int plus = 10 + 20;
        int minus = 20 - 10;
        int multiply = 20 * 10;
        int divide = 20 / 10;
        int modulo = 15 % 10;

        System.out.println(plus);
        System.out.println(minus);
        System.out.println(multiply);
        System.out.println(divide);
        System.out.println(modulo);

        int result = (3 + 2) * 3;
        System.out.println(result);

        // Nếu có dấu ngoặc thì bên trong ngoặc trước
        result = (3 + 2) * 3;
        System.out.println(result);
        // %는 *, / 와 같은 순서로 진행
        result = (10 + 5 % 3) / 3 + 2 * 3;
        System.out.println(result);

        // Kết quả của việc chia số nguyên tố là số nguyên tố
        System.out.println(21 / 10);
        int notDividedInt = 21 / 10;
        System.out.println(notDividedInt);  // 2

        double notDividedDouble = 21 / 10;
        System.out.println(notDividedDouble);  // 2.0

        // int intResult = 10.1 + 2;  // 오류

        int integer = (int) 2.1;
        System.out.println(integer);


        // Biến đổi hình thức ngầm (implicit)
        byte aByte = 1;
        short aShort = aByte;
        int aInt = aShort;
        long aLong = aInt;
        float aFloat = aLong;
        double aDouble = aFloat;

        // Biến đổi hình thức rõ ràng (explicit)
        double doubleVar = 10.24;
        int castDouble = (int) doubleVar;

        // Có thể mất dữ liệu.

        int dataLost = (int) 4294967296L;
        System.out.println(dataLost);

        double doubleDivide = (double) 21 / 10;
        System.out.println(doubleDivide);


        // Biến đổi hình dạng của Char
        int count = 0;
        // count = count + 1;
        count++;
        System.out.println(count);
        // count = count - 1;
        count--;
        System.out.println(count);

        count = 10;
        // Nếu dán phía trước thì trước tiên hãy nâng lên và sử dụng giá trị.
        ++count;
        // Dán phía sau thì dùng và tăng giá.
        count++;
        System.out.println(++count);
        System.out.println(count++);
        System.out.println(count);

        // Sử dụng '='
        int addTo = 1;
        // addTo = addTo + 10;
        addTo += 10;
        System.out.println(addTo); // 11
        addTo -= 10;
        addTo *= 10;
        addTo /= 10;
        addTo %= 10;
        System.out.println(addTo);

        int base = 2;
        // base = base * base;
        base *= base;
        System.out.println(base);
    }
}
