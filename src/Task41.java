import java.util.Scanner;

public class Task41 {
    public static void main(String[] args) {
        //Дано число. Если оно более 100 или менее -100,
        // то занулить, иначе увеличить его на 1.
        Scanner s = new Scanner(System.in);
        System.out.println("Inter X");
        int x = s.nextInt();
        if (x > 100 || x < -100) {
            System.out.println(x = 0);
        } else {
            System.out.println(x + 1);
        }
    }
}
