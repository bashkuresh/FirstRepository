import java.util.Scanner;

public class Task47 {
    public static void main(String[] args) {
        //Даны три числа. Найдите наибольшее число из них.
        Scanner s = new Scanner(System.in);
        System.out.println("Inter X");
        int x = s.nextInt();
        System.out.println("inter Y");
        int y = s.nextInt();
        System.out.println("inter Z");
        int z = s.nextInt();
        if (x>y&&x>z){
            System.out.println("x="+x);
        }if (y>x&&y>z){
            System.out.println("y="+y);
        }if (z>x&&z>y){
            System.out.println("z="+z);
        }
    }
}
