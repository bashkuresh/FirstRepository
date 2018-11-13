import java.util.Scanner;

//Даны два числа. Если первое число больше второго, то вывести yes,
// иначе поменять значения этих переменных и вывести их на экран.
public class Task39 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Inter X");
        int x = s.nextInt();
        System.out.println("inter Y");
        int y = s.nextInt();


        if (x > y) {
            System.out.println("Yes");
        } else{
            int z=x;
            x =y;
            y=z;
            System.out.println(x  +","+ y );

        }




    }


}

