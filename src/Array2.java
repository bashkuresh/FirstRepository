import java.util.Scanner;

public class Array2 {
    //Найти максимальный элемент в массиве из сгенерированных чисел
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.println("Введите length Массива");
        int length = S.nextInt();
        double[] array = new double[length];
        for (int i = 0; i < array.length; i++) {
            double han = S.nextDouble();
            array[i] = han;
        }
        double max=0;
        for (int i = 0; i < array.length; i++) {
           if(array[i]>max){
               max=array[i];
           }
        }
        System.out.println("Max: " + max);
    }


}

