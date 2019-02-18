import java.util.Arrays;
import java.util.Scanner;

public class ArrayTask29 {
    public static void main(String[] args) {
        //Дан массив x из n элементов. Найдите x1−x2+x3−…−xn−1+xn.
        Scanner s = new Scanner(System.in);
        System.out.println("Inter length X");
        int length = s.nextInt();
        int x[] = new int[length];
        int sum=0;

        for (int i=0;i<length;i++){
            if (i%2==0){
                x[i]=i+sum;
            }if (i%2==1){
                x[i]=i-sum;
            }

        }
        System.out.println(sum);
        System.out.println(Arrays.toString(x));
    }
}
