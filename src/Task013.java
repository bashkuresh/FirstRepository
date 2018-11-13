import java.util.Scanner;

public class Task013 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Double n = in.nextDouble();
        System.out.println("Введи значение n");
        double sum=1;
        double a;
        for (double i = 1; i < n; i++) {
            a =  ((2 * i) / (2 * i - 1)) * ((2 * i) / (2 * i + 1));
            sum =a*sum;


        }

        System.out.println(sum);

    }

}
