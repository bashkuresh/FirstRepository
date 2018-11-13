import java.util.Scanner;

public class Task22 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("f to c or c to f?");
        String g = s.nextLine();

        double celsius = s.nextDouble();
     //   System.out.println("Inter temperature in Celsius");
        double sum;
        if (g.equals("f")){
            sum = (celsius - 32) / 1.8;
        } else {
            sum = celsius * 9 / 5 + 32;
        }
        System.out.println(sum);
    }
}
