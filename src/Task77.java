import java.util.Scanner;
//Выведите на экран прямоугольник из нулей. Количество строк вводит пользователь, количество столбцов равно 5.
public class Task77 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int strok = s.nextInt();
        String o = "00000";
        for (int i=0; i<strok;i++){
            System.out.println(o);
        }


    }
}
