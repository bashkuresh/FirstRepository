import java.util.Arrays;
import java.util.Scanner;

public class ArraysTask10 {
    public static void main(String[] args) {
        //Создать массив, на четных местах в котором стоят единицы,
        // а на нечетных местах - числа, равные остатку от деления своего номера на 5.
        Scanner s = new Scanner(System.in);
        System.out.println("Inter Length of Array");
        int length = s.nextInt();

        int data[]=new int[length];
        for(int i=0;i<length;i++){
            if (i%2==0){
                data[i]=1;
            }else{
                data[i]=i%5;
            }

        }
        System.out.println(Arrays.toString(data));
    }
}
