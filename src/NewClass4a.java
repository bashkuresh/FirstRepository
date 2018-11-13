import java.util.Scanner;

// Напишите метод, который будет увеличивать заданный элемент массива на 10%.
public class NewClass4a {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите значение элемента");
        double element = s.nextDouble();
        double result;
        result = element*0.01;
        System.out.println(result);

    }
}
