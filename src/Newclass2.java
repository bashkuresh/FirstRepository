import java.util.Scanner;

public class Newclass2 {
    //Найти алгебраическую сумму для выражения: 1k + 2k + 3k + … + Nk. N и степень k вводит пользователь.
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите степень k любое число");
        int k = s.nextInt();
        System.out.println("Vvedy chislo N");
        int N = s.nextInt();
        double result = 0;
        for (int i = 1; i < N + 1; i++) {
            result = result + Math.pow(i, k);

        }
        System.out.println(result);
    }
}
