import java.util.Arrays;

public class ArrayTask59 {
    public static void main(String[] args) {
        //Найти наибольший четный элемент массива и поменять его местами с наименьшим нечетным элементом.
        // Если одного из таких элементов нет, то всем элементам массива присвоить значение, равное нулю.
        int[] intArray = new int[]{ 54, 6, 75, 74, 4, 8};
        int bolsheeChetnoe = 0;
        int mensheeNechetnoe = Integer.MAX_VALUE;
        int IndexBolshego=0;
        int IndexMenshee=0;
        boolean even = false;
        boolean odd = false;

        for (int i = 0; i < intArray.length; i++) {
            if (bolsheeChetnoe < intArray[i] && intArray[i] % 2 == 0) {
                bolsheeChetnoe = intArray[i];
                IndexBolshego=i;
                even = true;
            }
            if (mensheeNechetnoe > intArray[i] && intArray[i] % 2 == 1) {
                mensheeNechetnoe = intArray[i];
                IndexMenshee=i;
                odd = true;

            }

        }

        if (even==false || odd==false) {
            for (int i = 0; i < intArray.length; i++) {
                intArray[i] = 0;
            }
        } else {
            System.out.println(bolsheeChetnoe + " " + mensheeNechetnoe+ " ");
            intArray[IndexBolshego]=mensheeNechetnoe;
            intArray[IndexMenshee]=bolsheeChetnoe;
        }
        System.out.println(Arrays.toString(intArray));
    }
}