import java.util.Arrays;
import java.util.Scanner;

public class ArrayTask24 {
    public static void main(String[] args) {
        //Найдите сумму четных чисел массива.


        Scanner s = new Scanner(System.in);
        System.out.println("Inter Length of Array");
        int length = s.nextInt();
        int arr[] = new int[length];
        int sum=0;

        for (int i = 0; i < length; i++) {
            arr[i] = i;
            if (arr[i] % 2 == 0 && arr[i] <= length) {
                sum+=arr[i];
                System.out.println(sum);
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}