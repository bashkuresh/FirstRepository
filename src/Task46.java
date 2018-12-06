import java.util.Scanner;

public class Task46 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Inter X");
        int x = s.nextInt();
        System.out.println("inter Y");
        int y = s.nextInt();
        System.out.println("inter Z");
        int z = s.nextInt();
        //Пользователь вводит три числа.
        // Найти сумму тех чисел, которые делятся на 5.
        // Если таких чисел нет, то вывести error.
        if (x%5==0&&y%5==0&&z%5==0){
            System.out.println(x+y+z);
        }else {
            System.out.println("Error");
        }
    }
}
