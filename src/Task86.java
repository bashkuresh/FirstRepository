import java.util.Scanner;
//Для данного n найти сумму 1+2+3+...+n. Например, для n=10 ответ равен 55.
public class Task86 {
    public static void main(String[] args) {
        Scanner s  = new Scanner(System.in);
        int sum = 0;
        int n = s.nextInt();

        for (int i=0;i<=n;i++){
            System.out.println(i);
            sum=sum+i;
            //System.out.println(i);
        }
        System.out.println(sum);
    }
}
