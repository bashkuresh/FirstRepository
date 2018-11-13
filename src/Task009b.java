import java.util.Scanner;

public class Task009b {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число x");
        double x = in.nextDouble();
        if(x>2) {
            System.out.println("x должен быть больше >2");
            System.out.println((x * x - 1) / (x + 2));
        }
        if (x>0&&x<=2){
            System.out.println("0<x<=2");
            System.out.println((x*x - 1)*(x + 2));
            //x*x*(1 + 2x)
        }
        if(x<=0){
            System.out.println("x любое число");
            System.out.println(x*x*(1+2*x));
        }

        }
}



