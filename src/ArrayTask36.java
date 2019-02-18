import java.util.Arrays;
import java.util.Scanner;
//Среди элементов с нечетными номерами найдите наибольший элемент массива, который делится на 3.
public class ArrayTask36 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Inter Length of Array");
        int length = s.nextInt();
        int arr[] = new int[length];
        int max = arr[0];
        for (int i = 0; i < length; i++) {
            arr[i] = s.nextInt();
            if (arr[i] % 2 == 1) {

            }
            if (arr[i] > max && arr[i] % 3 == 0) {
                max = arr[i];
            }
        }
        System.out.println(max);
        System.out.println(Arrays.toString(arr));
    }
}