import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class ArrayTask45 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Inter Length of Array");
        int[] intArray = new int[]{2,4,5,2,4,5,67,87,15,33,67,4,1,0,1,0,7,8,3,5,2};

        List usedNumbersArrayList = new ArrayList();

        for (int i = 0; i < intArray.length; i++) {
            if (!usedNumbersArrayList.contains(intArray[i])){
                usedNumbersArrayList.add(intArray[i]);

            }
        }
        System.out.println(usedNumbersArrayList);
        System.out.println(usedNumbersArrayList.size());

    }
}
