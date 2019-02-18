import java.util.Arrays;
import java.util.Scanner;

public class ArrayTask11 {
    public static void main(String[] args) {
        //Scanner s = new Scanner(System.in);
       // System.out.println("Inter Length of Array");
      //  int length = s.nextInt();
        int data[]=new int[10];

        for(int i=0;i<10;i++){
            data[i]=i*111;
        } System.out.println(Arrays.toString(data));
    }
}
