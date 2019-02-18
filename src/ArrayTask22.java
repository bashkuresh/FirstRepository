import java.util.Scanner;

public class ArrayTask22 {
    public static void main(String[] args) {
        //Определите, каких чисел в массиве больше:
        // которые делятся на первый элемент массива
        // или которые делятся на последний элемент массива.
        Scanner s = new Scanner(System.in);
        System.out.println("Inter Length of Array");
        int length = s.nextInt();

        int data[] = new int[length];
        for (int i = 0; i < length; i++) {
            System.out.print(i);
            if (i % 1 == 0) {
                System.out.println("Na Perviy Element Delitsya Bolshe chisel -"+i);
            }if (i%length-1==0){
                System.out.println("Na Posledniy Element Delitsya Bolshe chisel -"+i);
            }


            }

    }
}
