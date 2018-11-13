import java.util.Scanner;// Напишите метод, который будет увеличивать заданный элемент массива на 10%

public class Array1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введитt размер массива ");
        int n = scanner.nextInt();
        System.out.println();
        double[] array = new double[n];
        for (int i = 0; i < array.length; i++) {
            System.out.println("введите значение массива "+i);
            double han = scanner.nextDouble();
            array[i] = han;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println("{" + i + "," + array[i] + "]");
        }
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i] * 2;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println("{" + i + "," + array[i] + "]");
        }

    }
}

