import java.util.Scanner;

public class Task48 {
    public static void main(String[] args) {
        //Даны три числа. Найдите те два из них, сумма которых наибольшая.
        Scanner s = new Scanner(System.in);
        System.out.println("Inter X");
        int x = s.nextInt();
        System.out.println("inter Y");
        int y = s.nextInt();
        System.out.println("inter Z");
        int z = s.nextInt();
        if (x + y > y + z || x + z > y + z) {
            System.out.println(x + "" + y);
        }
        if ( y+x  > x + z || y + z > x + z) {
            System.out.println(y + "" + z);
        }
        if (z + y > y + x || x + z > y + x) {
            System.out.println(z + "" + y);
        }
    }
}