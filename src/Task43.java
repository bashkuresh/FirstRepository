import java.util.Scanner;

public class Task43 {
    public static void main(String[] args) {
        //Пользователь вводит номер месяца.
        // Вывести название поры года (весна, лето и т.д.)
        Scanner s = new Scanner(System.in);
        System.out.println("Inter X");
        int x = s.nextInt();
        if (x == 12 || x == 1 || x == 2) {
            System.out.println("Winter");
        }
        if (x == 3 || x == 4 || x == 5) {
            System.out.println("Spring");
        }
        if (x == 6 || x == 7 || x == 8) {
            System.out.println("Summer");
        }
        if (x == 9 || x == 10 || x == 11) {
            System.out.println("Fall");
        }
    }
}