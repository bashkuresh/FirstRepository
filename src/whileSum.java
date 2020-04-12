

import java.util.Scanner;

public class whileSum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int num = s.nextInt();
        int sum = num;


        while (num != 0) {
            num = s.nextInt();

            sum += num;
        }
        System.out.println(sum);
    }


}