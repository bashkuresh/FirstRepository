import java.util.Arrays;

public class ArrayTask70 {
    public static void main(String[] args) {
       // Дан массив. Сформировать новый массив,
        // в котором идут сначала отрицательные элементы, затем нули, затем положительные.
        int arr[]=new int[]{1,1,2,3,4,5,35,7,5,8,9,0,0,-1,-4,-6,-1};
        Arrays.sort(arr);
        for (int i=0;i<arr.length;i++){

        }
        System.out.println(Arrays.toString(arr));
    }
}
