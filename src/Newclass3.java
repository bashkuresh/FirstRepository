import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class Newclass3 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int m=n;
        int i;
        int count = 0;
        while (n > 0) {
            n = n / 10; //n=34; n=3; n=0;;
            count++; //1 2
        }

        while (m > 0) {
            i = (int) (m / (Math.pow(10, count - 1)));
            System.out.println(i);
            m = (int) (m% (Math.pow(10, count - 1)));
            count--;

        }
    }
}
