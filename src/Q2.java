import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int div = a / b;
        int mod = a % b;
        System.out.println("A = " + div + " * B " + " + " + mod);
    }
}
