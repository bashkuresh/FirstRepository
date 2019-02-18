import java.util.Arrays;
import java.util.Scanner;

//Заполнить массив последовательными нечетными числами, начиная с единицы.
public class ArrayTask3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Inter Length of Array");
        int length = s.nextInt();
        int data[] = new int[length];
        int a = 1;
        for (int i = 0; i < length; i++ ) {
            data[i]=a;
            a=a+2;
        }
        System.out.println(Arrays.toString(data));
    }
}