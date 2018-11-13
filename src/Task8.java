import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);//(a+4b)(a−3b)+a2 при a=2 и b=3.
        int a= 2;
        int b= 3;
        int sum=(((a+4*b)*(a-3*b))+a*2);
        System.out.println(sum);
    }
}
