import java.util.Scanner;

public class ArrayTask8 {
    //Заполнить массив заданной длины различными простыми числами.
// Натуральное число, большее единицы, называется простым, если оно делится только на себя и на единицу.
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Inter Length of Array");
        int length = s.nextInt();
        int data[] = new int[length];
        int countOfDividers = 0;
        for (int i = 0; i < length; i++) {
            if (i % 1 == 0) {
                countOfDividers++;
            }
        }
        if (countOfDividers == 2) {
            System.out.println(data);
        } else {
            System.out.println("is not");
            //Int countOfDividers =0;
            //For (int i=1;i<I;i++){
            //If l%i==0{
            //countOfDividers++;
            //}
            //}
            //If countOfDividers == 2 {
            //Sout (I is a simple number )
            //} else sout (is not )}
        }
    }
}