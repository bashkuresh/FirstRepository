import java.util.Scanner;

public class Task006 {
    // ((x + 2)∗y −z)/y+y∗z

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число x");
        int x = in.nextInt();
        System.out.println("Введите число y" );
        int y = in.nextInt();
        System.out.println("Введите число z");
        int z = in.nextInt();
        double result;
        result = x+2;         //(x+2)
        result =y*result;     //(x+2)*y
        result = result-z;    //((x+2)*y-z)
        result = result/y+(y*z);
        System.out.println(result);


    }
}
