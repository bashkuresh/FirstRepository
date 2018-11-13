import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int num =s.nextInt();
        int square = (int)  Math.pow( num , 2 ) ;
        int cube = (int) Math.pow( num , 3 ) ;
        int sqrt = (int) Math.sqrt( num ) ;
      //  4. Выведите результаты вычислений.
                System.out.println( num + " в квадрате равно " + square ) ;
        System.out.println( num + " в кубе равно " + cube ) ; System.
                out.println( "Квадратный корень из " + num + " равен "+ sqrt );
    }
}
