import java.util.Arrays;
import java.util.Scanner;

public class ArrayTas1 {
    //Определить, содержит ли массив данное число x
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Inter X");
        int x = s.nextInt();

        int data[]=new int[10];
        for (int i=0; i<10;i++){
            System.out.println("Inter value of Array ["+i+"]");
            data[i]= s.nextInt();

        }
        System.out.println(Arrays.toString(data));


        for (int i=0;i<10;i++){
            if (data[i]==x){
                System.out.println(x+"Found one");
            }else{
                System.out.println("Error");;
            }
        }
    }
}
