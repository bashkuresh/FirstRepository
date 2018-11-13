import java.util.Scanner;

public class Task014 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введи значение X");
        double x = in.nextDouble();
        System.out.println("Введи значение N");
        double n = in.nextDouble();

        double sum =x;

        for(int i=0 ;i<n; i++){
            sum = x+Math.cos(sum);

        }
       System.out.println(Math.cos(sum));

    }
}
