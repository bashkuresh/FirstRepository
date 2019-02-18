import java.util.Arrays;

public class ArrayTask25 {
    public static void main(String[] args) {
        //Найдите сумму нечетных чисел массива, которые не превосходят 11
        int[] arr;
        int sum = 0;
        arr = new int[11];
        for (int i = 0; i < 11; i++) {
            arr[i] =  i;

        }
        System.out.println(Arrays.toString(arr  ));


        for (int i = 0; i < 11; i++) {


            if (arr[i] % 2 == 1 && arr[i] <= 11) {
                sum += arr[i];
            }

        }
        System.out.println("sum= "+sum);

    }
}
