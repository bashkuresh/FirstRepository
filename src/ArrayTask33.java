import java.util.Arrays;
import java.util.Scanner;

public class ArrayTask33 {
    public static void main(String[] args) {
        //Найдите количество элементов массива, которые отличны от наибольшего элемента не более чем на 10%.
        Scanner s = new Scanner(System.in);
        System.out.println("Inter length X");

        int length = s.nextInt();
        int count = 0;
        int arr[] = new int[length];
        int max = 0;
        for (int i=0;i<length;i++){
            arr[i]=s.nextInt();
            if (arr[i]>max){
                max=arr[i];

            }


        }for (int i=0;i<length;i++){
            int diff=max-arr[i];
            if (diff >0 && diff<=0.1*max){
                count++;
            }
        }
        System.out.println("max -"+max);
        System.out.println("count -"+count);
        System.out.println(Arrays.toString(arr));
    }
}
