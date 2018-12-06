import java.util.Scanner;

public class Task78 {
    public static void main(String[] args) {
        //Вывести на экран фигуру из звездочек:(квадрат из n строк, в каждой строке n звездочек);
        Scanner s  = new Scanner(System.in);
        int x = s.nextInt();
        int y = s.nextInt();
        String stroka ="";
        for (int i=0; i<x;i++){
            stroka = stroka + "*";
        }for (int i=0;i<y;i++){
            System.out.println(stroka);
        }
    }
}
