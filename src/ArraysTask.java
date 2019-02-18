import java.util.Arrays;
import java.util.Scanner;
//Сформировать убывающий массив из чисел, которые делятся на 3.
public class ArraysTask {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Inter Length of Array");
        int length = s.nextInt();
        System.out.println("Inter Firs Number X");
        int x = s.nextInt();
        int data[] = new int[length];

        for (int i = 0; i < length; i++) {
            if (x%3==0){
                data[i]=x;
            }else{
                while(x%3!=0) {
                    x--;
                }
                data[i]=x;
                }

            x = x - 3;
            }
        System.out.println(Arrays.toString(data));
        }

    }
