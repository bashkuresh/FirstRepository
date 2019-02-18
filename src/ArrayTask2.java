import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;
//Заполнить массив нулями и единицами, при этом данные значения чередуются, начиная с нуля.
public class ArrayTask2 {
    public static void main(String[] args) {
        Scanner s  = new Scanner(System.in);
        System.out.println("Inter Length of Array");
        int length = s.nextInt();
        int data[] = new int[length];
        for (int i=0;i<length;i++){

            if (i%2==0){
                data[i]=0;
            }else{
                data[i]=1;
            }
        }
        System.out.println(Arrays.toString(data));
    }
}
