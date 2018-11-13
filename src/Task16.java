import java.util.Scanner;

public class Task16 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);//Пользователь вводит три числа. Увеличьте первое число в два раза, второе числа уменьшите на 3, третье число возведите в квадрат и затем найдите сумму новых трех чисел.
        System.out.println("Inter A");
        int a = in.nextInt();
        System.out.println(a*2);
        System.out.println("Inter B");
        int b = in.nextInt();
        System.out.println(b/3);
        System.out.println("Inter C");
        int c = in.nextInt();
        int n = in.nextInt();
        System.out.println(Math.pow(c,n));
        System.out.println("Sum of A, B ,C");
        System.out.println(a+b+c);

    }

}
