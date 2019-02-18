import java.util.Arrays;
import java.util.Scanner;

//Создать массив, каждый элемент которого равен квадрату своего номера.
public class ArraysTask9 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Inter Lenght of Array");
        int length = s.nextInt();
        int data[] = new int[length];

        for (int i = 0; i < length; i++) {
           // System.out.println(Arrays.toString(data));
            System.out.print("["+i+"]");
         data[i] =i*i;
        }
        System.out.println();
        System.out.println(Arrays.toString(data));
    }
}