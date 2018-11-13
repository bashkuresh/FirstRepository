import java.util.Scanner;
//Пользователь вводит количество недель, месяцев, лет и получает количество дней за это время. Считать, что в месяце 30 дней.
public class Task25 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int sum =0;

        System.out.println("Inter quantity of weeks");
        int week = s.nextInt();

        sum = sum + week*7;

        System.out.println("Inter quantity of month");
        int month = s.nextInt();
       
        sum =sum+ month*30;

        System.out.println("Inter quantity of yers");
        int year = s.nextInt();

        sum =sum +  year*365;
        System.out.println(sum);





    }
}
