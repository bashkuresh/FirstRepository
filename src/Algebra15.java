import java.util.Scanner;

public class Algebra15 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Inter X");
        double x = s.nextDouble();
        System.out.println("Inter Y");
        double y = s.nextDouble();

        double sum = 0;
        sum = Math.pow(x, y);
        System.out.println(sum);

    }
}
