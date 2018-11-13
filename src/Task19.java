import java.util.Scanner;

public class Task19 {
    public static void main(String[] args) {//Пользователь вводит цены 1 кг конфет и 1 кг печенья. Найдите стоимость: а) одной покупки из 300 г конфет и 400 г печенья; б) трех покупок, каждая из 2 кг печенья и 1 кг 800 г конфет.
        Scanner in = new Scanner(System.in);
        System.out.println("Inter the weight of candies");
        double a = in.nextDouble();
        System.out.println(a*0.3);
        System.out.println("Inter the weight of potatos");
        double b = in.nextDouble();
        System.out.println(b*0.4);


    }
}
