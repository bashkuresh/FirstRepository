import java.util.Scanner;

public class Task17 {
    public static void main(String[] args) {//Пользователь вводит три числа. Найдите среднее арифметическое этих чисел, а также разность удвоенной суммы первого и третьего чисел и утроенного второго числа.
        Scanner in = new Scanner(System.in);
        System.out.println("Inter A");
        int a = in.nextInt();
        System.out.println("Inter B");
        int b = in.nextInt();
        System.out.println("Inter C");
        int c = in.nextInt();
        int sum = a+b+c;
        System.out.println(sum/3);

    }
}
