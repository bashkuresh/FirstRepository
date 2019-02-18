import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class ArrayTask56 {
    public static void main(String[] args) {
        //В массиве заменить все числа, большие данного числа, на среднее арифметическое всех чисел массива.
        Scanner s = new Scanner(System.in);
        System.out.println("Inter Length of Array");

        int[] intArray = new int[]{2, 4, 5, 2, 4, 5, 7, 8, 9, 0, 3, 4, 14, 5, 6, 7, 8, 9, 524, 3, 12, 3, 4, 4, 54, 65, 47, 74, 8, 8};

        int sum = IntStream.of(intArray).sum();
        int average = sum / intArray.length;

        System.out.println("Average = " + average);
        System.out.printf("Inter DannoeChislo");
        int dannoeChislo = s.nextInt();
        for (int i = 0; i < intArray.length; i++) {
            if (dannoeChislo < intArray[i]) {
                System.out.println( intArray[i]);
                intArray[i] = average;



            }

        }
        System.out.println(Arrays.toString(intArray));
        System.out.println();
    }
}
