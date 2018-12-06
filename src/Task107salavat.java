import java.math.BigInteger;

public class Task107salavat {
    public static void main(String[] args) {
        BigInteger sum = BigInteger.valueOf(1);
        for (int i = 10; i > 0; i--) {
            for (int k = i; k > 0; k--) {
                System.out.print(i+" ");
                sum = sum.multiply(BigInteger.valueOf(i));
               // System.out.println(sum);
            }
            System.out.println();
        }
        System.out.println(sum);
    }
}



