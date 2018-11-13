import java.util.Scanner;

public class Task015 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Inter var N");
        double n = in.nextDouble();
        System.out.println("Inter var X");
        double x = in.nextDouble();

        double sum = 1;
        for (double i = n; i > 0; i--) {
            sum=i+x/sum;
        }
        System.out.println(sum);
        }
    }
