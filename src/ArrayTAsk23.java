import java.util.Arrays;
import java.util.Scanner;

public class ArrayTAsk23 {
    //Найдите сумму и произведение элементов массива.
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Inter Length of Array");
        int length = s.nextInt();
        int data[]= new int [length];
        int sum = 0;

        for (int i=0;i<length;i++){
            data[i]=i;
           sum = sum+i;
            System.out.println(sum);
           sum=sum*i;
            System.out.println(sum);
        }
        System.out.println(Arrays.toString(data));;
    }
}
