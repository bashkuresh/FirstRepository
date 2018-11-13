import java.util.Scanner;
public class NewClass {
    //Вывести площадь прямоуголника. Стороны прямоугольника вводятся пользователем.
    //
    public static void main(String[] args) {
        Scanner S =new Scanner(System.in);
        System.out.println("Введите Стороны прямоугольника a и b");
        int a = S.nextInt();
        int b = S.nextInt();
        int result;
        result = a*b;
        System.out.println(result);
    }
}
