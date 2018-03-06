import java.util.Scanner;
public class Task011 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Факторил ввод");
        int n = in.nextInt();
        int result = 1;
        if (n % 2 == 0) { //n!!=2*4*6...*n

                for (int i = 2; i <= n; i = i + 2) {
                    result = result*i;
                }
            }
        if (n % 2 == 1){ //n!! =1*3*5*...*n
                for (int i =1; i <=n; i =i+2) {
                    result = result*i;

                }
        }

        System.out.println(result);
    }
}


