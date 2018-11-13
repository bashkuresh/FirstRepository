import java.util.Scanner;
// (x+1)2+3(x+1) при а) x=1.7; б) x=3. Ответ: а) 15.39 б) 28
public class Algebra10 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Inter Double x");
        double sum = 0;
        double x=1.7;
        sum = Math.pow((x+1),2)+3*(x+1);
        System.out.println(sum);


    }
}
