package d3;

public class D31Conditional {
    public static void main(String[] args) {
        int age = 10;
        if ( age < 20) {
            System.out.println("You cannot enter");
        }
        // 비교, 논리 연산자가 많이 활룔되며
        if (true) System.out.println("always run");

        int num = 7;
        // num의 짝수이면 event이라고 출력하고 싶다.
        if (num % 2 == 0) {
            System.out.println("even");
        }

        // 4의 배수인지 확인한 다음
        // 4의 배수가 맞으면 100의 배수인지
        // 100의 배수가 맞으면 400의 배수인지
        int year = 2024;
        if (year % 4 ==0) {
            System.out.println("4의 배수");
            if (year % 100 == 0) {
                System.out.println("100의 배수");
                // 4의 배수이면서 100의 배수일때만 실행되는 코드
            }
            if (year % 400 == 0) {
                // 4의 배수이면서 4-00의 배수일때만 실행되믄 코드
                System.out.println("400의 배수");
            }
        }

        // 느긋하면(남은시간 1시간 이상) 버스, 급하면 택시
        int current = 8;
        int goal = 9;
        if (goal - current >= 2) {
            System.out.println("Take Bus");
        }
        else if (goal - current >= 1) {
            System.out.println("Take Subway");
        }
        else {
            System.out.println("Take Cab");
        }


        int dust = 62;
        if (dust <= 30) {
            System.out.println("Good");
        }
        else if(dust <= 80) {
            System.out.println("Bad");
        }
        else if (dust <= 150) {
            System.out.println("Normal");
        }
        else {
            System.out.println("Very Bad");
        }

        // 만약 앞선 조건이 true이 되면 아래는 실행되지 않다.
        int someNum = 0;
        if (someNum == 0) {
            System.out.println("someNum is 0");
        }
        else if (10 % someNum == 0) {
            System.out.println("someNum is factor of 10");
        }
        else {
            System.out.println("someNum is not factor f 10");
        }

        // 만약에 검사하고 싶은 조건이 a == <특정 값>으로 이뤄져 있으면?
        char input = 'w';
        if (input == 'w') {
            System.out.println("up");
        }
        else if (input == 's') {
            System.out.println("down");
        }
        else if (input == 'd') {
            System.out.println("right");
        }
        else if (input == 'a') {
            System.out.println("left");
        }

        // 이럴때는 switch - case를 쓸 수 있다.
        // 괄호 안에 대상 변수를 넣어준다.
        input = 's';
        switch (input) {
            case 'w':  // 콜론(:)
                System.out.println("up");
                break;
            case 's':  // 콜론(:)
                System.out.println("down");
                break;
            case 'd':  // 콜론(:)
                System.out.println("right");
                break;
            case 'a':  // 콜론(:)
                System.out.println("left");
                break;
            default:
                System.out.println("Not a direction");
        }
        // 다르게 말하면 모든 if 조건이 '=='으로 이뤄진 if를 대신할 수 있다.
    }
}
