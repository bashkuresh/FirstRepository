import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Task37 {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        System.out.println("Inter X");
        int x = s.nextInt();
        System.out.println("inter Y");
        int y = s.nextInt();

        if(x>y){
            System.out.println("x>y =" +x);
        }else {
            System.out.println("y>x =" +y);
        }
    }
}
