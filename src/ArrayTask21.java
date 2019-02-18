import java.util.Arrays;
import java.util.Scanner;

public class ArrayTask21 {
    public static void main(String[] args) {
        // Найти количество чисел в массиве, которые делятся на 3, но не делятся на 7.
        Scanner s = new Scanner(System.in);
        System.out.println("Inter Length of Array");
        int length = s.nextInt();

        int data[] = new int[length];
        for (int i = 0; i < length; i++) {
            System.out.println(i);
            if (i % 3 == 0 && i % 7 != 0) {
                System.out.println(" Это число делится на 3 - " + i);
                data[i]=length;
            }else{
                System.out.println("Не делится на 3 -  "+i);
            }

        } System.out.println(Arrays.toString(data));
    }
}