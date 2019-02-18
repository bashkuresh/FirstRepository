import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class ArrayTask14 {
    public static void main(String[] args) {
        //Заполните массив случайным образом нулями и единицами так,
        // чтобы количество единиц было больше количества нулей.
        Scanner s = new Scanner(System.in);

        System.out.println("Inter Length of Array");

        int length = s.nextInt();

        int data[] = new int [length];

        Random random = new Random();

        int minimum = 51;

        int maximum = 100;

        int percentage = minimum + random.nextInt((maximum - minimum) + 1);

        int countOfOneNumber = length * percentage / 100;

        System.out.println(countOfOneNumber + "count of numbers");

        System.out.println(Arrays.toString(data));
        for(int i = 0; i<length;i++) {
            data[i] = -1;
        }

        System.out.println(Arrays.toString(data));

        int c =0;

        while ( c < countOfOneNumber) {
            int randomNumber = random.nextInt(length);
            System.out.println(randomNumber);
            if (data[randomNumber]==-1) {
                data[randomNumber] =1;
            } else {
                System.out.println("ERROR");
            }
            c++;
        }
        for(int i = 0; i< length; i++) {
            if (data[i]==-1) {
                data[i]=0;
            }
        }

        System.out.println(Arrays.toString(data));



    }
}
