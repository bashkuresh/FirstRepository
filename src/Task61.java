import java.util.Scanner;
//Дано пятизначное число. Цифры на четных позициях занулить. Например, из 12345 получается число 10305.
public class Task61 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Inter 5 Digit number");


        System.out.println("inter 1st Dig");
        int x1 = s.nextInt();
        System.out.println("inter 2d Dig");
        int x2 = s.nextInt();
        System.out.println("inter 3d Dig");
        int x3 = s.nextInt();
        System.out.println("inter 4th Dig");
        int x4 = s.nextInt();
        System.out.println("inter 5th Dig");
        int x5 = s.nextInt();


        System.out.println(x1+""+0+""+x3+""+0+""+x5);
    }
}
