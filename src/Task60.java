import java.util.Scanner;
//Дано трехзначное число. Переставьте первую и последнюю цифры.
public class Task60 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Inter 3 Digit num");
        System.out.println("inter x1");
        int x1 = s.nextInt();
        System.out.println("inter 2d Dig");
        int x2 = s.nextInt();
        System.out.println("inter 3d Dig");
        int x3 = s.nextInt();
        System.out.println(x1+""+x2+""+x3);
        System.out.println("Pushtop x3 && PushBack x1");
        System.out.println(x3+""+x2+""+x1);

    }
}
