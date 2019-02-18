import java.util.Arrays;
import java.util.Scanner;
//Найти количество четных чисел в массиве.
public class ArrayTask20 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Inter Length of Array");
        int length = s.nextInt();

        int data[] = new int[length];
        for (int i = 0; i < length; i++) {
            if (i % 2 == 0) {
                System.out.println(" Четное " + i);
                data[i] = i;
            }else{
                System.out.println(" Нечетное "+i);
            }
        }


        System.out.println(Arrays.toString(data));
    }
}