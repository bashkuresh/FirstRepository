import java.util.Scanner;

public class Task42 {
    public static void main(String[] args) {
        //Дано число. Если оно от 2 до 5 включительно, то увеличить его на 10.
        // Если оно от 7 до 40, то уменьшить на 100.
        // Если оно не более 0 или более 3000, то увеличить в 3 раза (то есть умножить на 3).
        // Иначе занулить это число.
        Scanner s = new Scanner(System.in);
        System.out.println("Inter X");
        int x = s.nextInt();
        if (x >= 2 && x <= 5) {
            System.out.println("Увеличенно На 10" + (x + 10));
        }
        if (x >= 7 && x <= 40) {
            System.out.println(  x - 100);
        }
        if (x < 0 || x > 3000) {
            System.out.println("Увеличили В 3 раза" + x * 3);
        } else {
            System.out.println( x = 0);
        }

    }
}
