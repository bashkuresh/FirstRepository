import java.util.Arrays;

public class ArrayTask601 {
    public static void main(String[] args) {
        //Удалить в массиве первый и последний элементы.
        int[] intArray = new int[]{2, 4, 5, 2, 4, 5, 7, 8, 9, 0, 3, 4, 14, 5, 6, 7, 8, 9, 524, 3, 12, 3, 4, 4, 54, 65, 47, 74, 8, 8};
        int arr []= new int[intArray.length-2];//создаем 2й массив на два значения меньше
        for (int i=1;i<intArray.length-1;i++){//начинаем с 1 индекса и последный минус один
            arr[i-1]=intArray[i];//так как в новом массиве мы начинаем с 0 индекса то i-1 и приравниваем его к первому массиву
        }
        System.out.println(Arrays.toString(arr));
    }
}
