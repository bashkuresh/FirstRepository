import java.util.Scanner;

//Пользователь вводит три числа.
// Если все числа больше 10 и первые два числа делятся на 3,
// то вывести yes, иначе no
public class Task45 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Inter X");
        int x = s.nextInt();
        System.out.println("inter Y");
        int y = s.nextInt();
        System.out.println("inter Z");
        int z = s.nextInt();
        if (x > 10 && x % 3 == 0 && y > 10 && y % 3 == 0 && z > 10) {
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }


    }
}
