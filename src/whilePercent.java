import java.util.Scanner;

public class whilePercent {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Inter Money");
        int m = s.nextInt();
        System.out.println("Inter Percent");
        int p = s.nextInt();
        System.out.println("Inter Finale Amount");
        int k = s.nextInt();
        int count = 0;
        while(k>=m){

            m = m+m*(p/100);
            count++;
        }System.out.println(count);



    }
}

