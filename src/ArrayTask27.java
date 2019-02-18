import java.util.Arrays;
import java.util.Scanner;

public class ArrayTask27 {
    public static void main(String[] args) {
        //Найдите сумму чисел массива, которые стоят на четных местах.
        Scanner s = new Scanner(System.in);
        System.out.println("Inter length of Array");
        int length = s.nextInt();
        int arr[]=new int[length];
        int  sum = 0;

        for(int i=0;i<length;i++){
            if (i%2==0){
                arr[i]=i;
                sum+=arr[i];
            }
            System.out.println(i+" "+sum);
        }
        System.out.println(Arrays.toString(arr));
    }
}

