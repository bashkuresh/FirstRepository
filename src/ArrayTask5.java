import java.util.Arrays;
import java.util.Scanner;

public class ArrayTask5 {
    public static void main(String[] args) {
        //Сформировать возрастающий массив из четных чисел.
        Scanner s = new Scanner(System.in);
        System.out.println("Inter Length of Array");
        int length = s.nextInt();
        int data[] = new int[length];
        int a = 0;
        for (int i = 0; i < length; i++) {
            data[i] = a;
            a = a + 2;
        }
        System.out.println(Arrays.toString(data));
    }
}