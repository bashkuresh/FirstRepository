import java.util.Scanner;

//Сила тяжести на Луне примерно равна 17%, напишите программу, которая вычисляет ваш вес на Луне.
public class NewClass4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите массу тела");
        double weight = s.nextDouble();
        double result;
        result = weight * 0.17;
        System.out.println(result);
    }


}


