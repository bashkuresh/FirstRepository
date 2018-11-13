import java.util.Scanner;
//Пользователь вводит три числа. Увеличьте первое число в два раза, второе числа уменьшите на 3, третье число возведите в квадрат и затем найдите сумму новых трех чисел.
public class Algebra16 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Inter A");
        double a = s.nextDouble();
        System.out.println("Inter B");
        double b = s.nextDouble();
        System.out.println("Inter C");
        double c = s.nextDouble();
        double sum = 0;
        double sum1 = 0;
        double sum2=0;
        System.out.println(sum=a*2);
        System.out.println(sum1=b/3);
        System.out.println(sum2=Math.pow(c,2));
        System.out.println(sum+sum1+sum2);

    }
}
