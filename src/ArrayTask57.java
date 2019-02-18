import java.util.Arrays;

public class ArrayTask57 {
    public static void main(String[] args) {
        //Дан массив. Заменить все числа, меньшие последнего элемента массива, на первый элемент.
        int[] intArray = new int[]{2, 4, 5, 2, 4, 5, 7, 8, 9, 0, 3, 4, 14, 5, 6, 7, 8, 9, 524, 3, 12, 3, 4, 4, 54, 65, 47, 74, 8, 8};
        int first = intArray[0];
        int last = intArray[intArray.length - 1];

        for (int i=0;i<intArray.length;i++){
            if (last>intArray[i]){
                System.out.println(intArray[i]);
                intArray[i]=first;
            }

        }System.out.println(Arrays.toString(intArray));
    }
}
