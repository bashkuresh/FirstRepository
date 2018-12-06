import java.util.Scanner;
//Даны коэффициенты a,b,c уравнения ax2+bx+c=0. Найти решение. Проверить ответы можно здесь. Как решать квадратные уравнения можно прочитать здесь.
public class Task65 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("inter A");
        int a = s.nextInt();
        System.out.println("inter B");
        int b = s.nextInt();
        System.out.println("inter C");
        int c = s.nextInt();
        int sum = 0;
        double x2 = 0;
        double x1 = 0;
        double d = Math.pow(b,2)-4*a*c;
        System.out.println("Discriminant="+d);
        if (d>0){
            x1 = -b+(Math.sqrt(d))/(2*a);
            x2 = -b-(Math.sqrt(d))/(2*a);
            System.out.println("X1 = "+x1+","+"X2="+x2);
        }if (d==0){
           x1=-b/(2*a);
            System.out.println("x1="+x1);
        }if (d<0){
            System.out.println("No solution");
        }
    }
}
