import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.util.concurrent.ArrayBlockingQueue;

public class Marathone {
    public static void main(String[] args) {
        String[] names = {"Elena", "Thomas", "Hamilton", "Suzie", "Phil", "Matt", "Alex", "Emma", "John", "James", "Jane", "Emily", "Daniel", "Neda", "Aaron", "Kate", "Arthur"};
        int[] times = {341, 273, 278, 329, 445, 402, 388, 275, 243, 334, 412, 393, 299, 343, 317, 265, 100};


        int t =0;
        while(t<times.length){ // я буду выводить этого столько раз, сколько элементов в массиве

            System.out.println(t+1 + " место!");
            System.out.println(times[findMin(times)]);
            System.out.println(names[findMin(times)]);
            times[findMin(times)] = 50000; //каждый раз наименьшее число я приравниваю к 50000
            t++;
        }
    }

    public static int findMin(int [] array){ // метод по нахождению минимального числа в массиве
       int  min = 5000;
        int index = 0;
        for(int i=0; i<array.length;i++){
            if(array[i]< min){
                min=array[i];
                index=i;
            }
        }
        return index;
    }
}
