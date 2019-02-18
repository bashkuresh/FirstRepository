import java.util.Arrays;
import java.util.Scanner;

public class ArrayTask1 {
    public static void main(String[] args) {
        //Заполнить массив нулями, кроме первого и последнего элементов, которые должны быть равны единице.
        Scanner s  = new Scanner(System.in);
        int length = s.nextInt();
        int data[] = new int[length];
        /*
        for (int i =0; i< length; i++) {
            if (i == 0 || i == length-1) {
                data[i] = 1;
            } else {
                data[i] = 0;
            }
        }
        */
       // int a = s.nextInt();
        for (int i=0;i<length;i++){
            data[i]= s.nextInt();
        }
        for(int i=0;i<length;i++){
            System.out.print(data[i]);

        }


        System.out.println(Arrays.toString(data));



    }
}
