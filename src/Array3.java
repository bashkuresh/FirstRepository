import java.util.Scanner;//Найдите среднее арифметическое массива из 10 элементов типа double

public class Array3 {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.println("Введите 10 эл Масива");
        int length = S.nextInt();
        double sum=0;
        double[] array = new double[length];
        for (int i = 0; i < array.length; i++) {
            double han = S.nextDouble();
            array[i] = han;

            sum = (array[i]+sum);



        }
        System.out.println(sum/length);
    }
}
