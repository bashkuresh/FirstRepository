import java.util.Scanner;

public class Task35 {
    public static void main(String[] args) {
        //Дано число. Если оно меньше 7, то вывести Yes,
        // если больше 10, то вывести No, если равно 9, то вывести Error.
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        if (x<7){
            System.out.println("Yes");
        }
        if(x>10){
            System.out.println("No");
        }if(x==9){
            System.out.println("Error");
        }
        System.out.println(x);
    }
}
