import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Task59 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Inter 4 digit number");
        System.out.println("inter 1st Dig");
        int x1 = s.nextInt();
        System.out.println("inter 2d Dig");
        int x2 = s.nextInt();
        System.out.println("inter 3d Dig");
        int x3 = s.nextInt();
        System.out.println("inter 4th Dig");
        int x4 = s.nextInt();
        if (x1>x2&&x1>x3&&x1>x4&&x2>x3&&x2>x4&&x3>x4){
            System.out.println("yes");
            System.out.println(x1+""+x2+""+x3+""+x4);
        }else {
            System.out.println("no");
            System.out.println();
        }
    }
}
