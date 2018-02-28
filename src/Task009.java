import java.util.Scanner;

public class Task009 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println(" Введите y");
        double y = scanner.nextDouble();

        if(y==6){
            System.out.println("Деление на ноль запрещено, введите другое число, не равное 6");
        } else {
            System.out.println(10 / (y - 6));
        }
    }
}
