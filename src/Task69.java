import java.util.Scanner;

public class Task69 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("inter A");
        int a = s.nextInt();
        System.out.println("inter B");
        int b = s.nextInt();
        System.out.println("inter C");
        int c = s.nextInt();


        double P = (a + b + c) / 2;
        System.out.println("Sum of Poluperimetr"+P);

        System.out.println("Area of a Triangale");
        double sum =Math.sqrt(P*(P-a)*(P-b)*(P-c));
        System.out.println("Area of a Triangale="+sum);


    }
}
