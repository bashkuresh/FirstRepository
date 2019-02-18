import java.util.Arrays;
import java.util.Scanner;

public class ArrayTask4 {
    public static void main(String[] args) {
        //Сформировать массив из элементов арифметической прогрессии с заданным первым элементом x и разностью d.
        Scanner s = new Scanner(System.in);
        System.out.println("Inter Length of Array");
        int length = s.nextInt();
        int data[] = new int[length];
        System.out.println("Inter 1st element");
        int x = s.nextInt();
        System.out.println("Inter d");
        int d = s.nextInt();
        for (int i = 0; i < length; i++) {
            data[i]=x;
            x+=d;
        }
        System.out.println(Arrays.toString(data));
    }
}