import java.util.Arrays;

public class ArrayTask78 {
    public static void main(String[] args) {
        // В данном массиве каждый элемент равен 0, 1  или 2.
        // Переставить элементы массива так, чтобы сначала располагались все нули,
        // затем все единицы и,
        // наконец, все двойки. Дополнительный массив не использовать.
        int []arr=new int[]{0,1,2,1,2,1,2,0,0,0,2,2,1,1,1,2,0,0,1,1,1};
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        for (int i=0;i<arr.length;i++){

        }
        System.out.println(Arrays.toString(arr));
    }
}
