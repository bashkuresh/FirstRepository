import java.util.Scanner;

public class Task009a {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = 20;
        System.out.println("Введите свой возраст");
        int vozrast = scanner.nextInt();
        if (vozrast == 20) {
            System.out.println("Вы равесники");
        }
        if (vozrast < age) {
            System.out.println("Вы младше");
        }
        if (vozrast > age) {
            System.out.println("Вы старше");
        }
    }
}

