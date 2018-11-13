import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {//(x+1)2+3(x+1) при а) x=1.7; б) x=3
        Scanner in= new Scanner(System.in);
        double sum1 = 0;
        double sum=0;
        double sum2 = 0;
        double x = 3.0;
        sum = Math.sqrt(x+1);
        sum2 = 3*x+3;
        sum=sum1+sum2;
        System.out.println(sum);
        
    }
}
