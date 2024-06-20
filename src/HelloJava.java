import java.util.Scanner;

public class HelloJava {
    public static void main(String[] args) {
        System.out.println("Hello Java");

        Scanner scanner = new  Scanner(System.in);
        System.out.println(scanner.nextLine());
        scanner.nextLine();
    }
}