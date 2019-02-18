import java.util.Arrays;
import java.util.Scanner;

public class ArrayTask13 {
    public static void main(String[] args) {
        //Сформировать массив из случайных чисел,
        // в которых ровно две единицы, стоящие на случайных позициях.
        Scanner s = new Scanner(System.in);
        System.out.println("Inter Length of Array");
        int length = s.nextInt();
        int a =  (int)(Math.random()*((length-1)+1));
        int b = (int)(Math.random()*((length-1)+1));
        int data[] = new int[length];
        for (int i = 0; i < length; i++) {
            if (i == a || i == b) {
                data[i] = 1;
            } else {
                data[i] = (int) (Math.random()*length);

            }

        }System.out.println(Arrays.toString(data));
    }
}