import java.util.Scanner;

public class Task38 {
    public static void main(String[] args) {
        //Дано два числа. Вывести yes, если они отличаются на 100, иначе вывести No
        Scanner s =new Scanner(System.in);
        System.out.println("Inter X");
        int x = s.nextInt();
        System.out.println("inter Y");
        int y = s.nextInt();

        if (x-y==100){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }
    }
}
