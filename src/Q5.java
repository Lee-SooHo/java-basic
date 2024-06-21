import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int temprature = scanner.nextInt();
        System.out.println(temprature > 20 && temprature < 30);
    }
}
