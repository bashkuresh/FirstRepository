import java.util.Scanner;
//Дано две даты, каждая из которых состоит из трех чисел (день, месяц и год). Вывести yes, если первая дата раньше второй, иначе вывести no.
public class Task58 {
    public static void main(String[] args) {
        Scanner s  = new Scanner(System.in);
        System.out.println("Inter month");
        int month = s.nextInt();
        System.out.println("Inter day");
        int day = s.nextInt();
        System.out.println("Inter a year");
        int year = s.nextInt();

        System.out.println("Inter month 1");
        int month1 = s.nextInt();
        System.out.println("Inter day 1");
        int day1 = s.nextInt();
        System.out.println("Inter a year 1");
        int year1 = s.nextInt();

        if (year>year1){
        }
        if(month>month1){
        }
        if (day>day1){ System.out.println(month+"."+day+"."+year);
        }else{
            System.out.println(month1+"."+day1+"."+year1);

    }


    }
}
