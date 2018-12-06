import java.util.Scanner;

public class Task44 {
    public static void main(String[] args) {
        //Пользователь вводит два числа. Если они не равны 10 и первое число четное,
        // то вывести их сумму, иначе вывести их произведение.
        Scanner s = new Scanner(System.in);
        System.out.println("Inter X");
        int x = s.nextInt();
        System.out.println("inter Y");
        int y = s.nextInt();
        //for (int x%2=0)
        if( x!=10&&y!=10&&x%2==0){
            System.out.println(x+y);
        }else{
            System.out.println(x*y);
        }
    }
}
