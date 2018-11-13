import java.util.Scanner;

public class Task40 {
    public static void main(String[] args) {
        //Дано число. Если оно от -10 до 10 не включительно,
        // то увеличить его на 5, иначе уменьшить на 10.
        Scanner s  = new Scanner(System.in);
        System.out.println("Inter Var X");
        int x = s.nextInt();
        if (x>=-10&&x<=10){
            System.out.println(x+5);
        }else{
            System.out.println(x-10);
        }
    }
}
