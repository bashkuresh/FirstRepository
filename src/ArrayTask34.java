import java.util.Arrays;
import java.util.Scanner;
//Найдите наименьший четный элемент массива
public class ArrayTask34 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Inter Length of Array");
        int length = s.nextInt();
        int arr[] = new int[length];
        int min = 500;
        for (int i = 0; i < length; i++) {
            arr[i] = s.nextInt();
            if (arr[i] < min&&arr[i]%2==0) {
                min = arr[i];

            }


            }System.out.println(Arrays.toString(arr));
        System.out.println(min);

        }

    }