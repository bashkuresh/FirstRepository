
import java.util.Scanner;

public class simpleBot2 {

        public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            int a = s.nextInt();
            int b = s.nextInt();
            long sum = 1;
            for (int i = a; i <b; i++) {

                sum =sum * i;
                System.out.print(i +" ");
            }System.out.println(sum);
        }
    }

