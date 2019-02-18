import java.util.Arrays;
import java.util.Scanner;
//Найти наибольший элемент массива.
public class ArrayTask32 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Inter length of arr");
        int length = s.nextInt();
        int arr[] = new int[length];
        int max = arr[0];
        for (int i=0;i<length;i++){
            arr[i]=s.nextInt();//=i
            if (arr[i] > max)
                max = arr[i];

        }
        System.out.println(Arrays.toString(arr));
        System.out.println(max);
    }
}
