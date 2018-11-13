import java.util.Scanner;
//(a+4b)(a−3b)+a2 при a=2 и b=3. Ответ:  -94
public class algebra8 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int sum = 0;
        int sum1 =0;
        int a=2;
        int b=3;
        sum = (a+4*b)*(a-3*b)+a*a;
        System.out.println(sum);


    }
}
