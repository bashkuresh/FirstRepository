import java.util.Scanner;

public class Task28 {
    public static void main(String[] args) {
        //Пользователь вводит сумму вклада в банк и годовой процент.
        // Найдите сумму вклада через 5 лет (рассмотреть два способа начисления процентов)
        Scanner s  = new Scanner(System.in);

        System.out.println("Введите Сумму вклада");
        double sum = s.nextDouble();

        System.out.println("Введите процент");
        double percent = s.nextDouble();

        System.out.println(sum*(percent/100)*5);
    }
}
