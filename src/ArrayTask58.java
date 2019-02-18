import java.util.Arrays;

public class ArrayTask58 {
    public static void main(String[] args) {
        //Поменять местами наибольший и наименьший элементы массива.
        int[] arr = new int[]{2, 7, 4, 5, 20, 4, 15, 7, 87, 9, 31, 4, 14, 5, 6, 700, 8, 9, 24, 3, 12, 3, 4, 4, 54, 65, 47, 74, 8, 8};
        int max=0;
        int amax=0;
        int bmin=0;

        int min=Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
                amax=i;
            }
            if (min>arr[i]){
                min=arr[i];
                bmin=i;



            }
        }
        System.out.println("Maxvalue:" + max);
        System.out.println("Min value:" + min);
        System.out.println(amax);
        System.out.println(bmin);
        arr[amax]=min;
        arr[bmin]=max;

        System.out.println(Arrays.toString(arr));
    }
}