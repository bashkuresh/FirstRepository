import java.util.Scanner;

//Выведите  на экран строки (в последней строке n звездочек):
public class Task109 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Inter Num of Stars");
        int num = s.nextInt();
        String stroka = "*";
        //Выведите  на экран строки (в последней строке n звездочек):
        for (int i = 1; i <= num; i++) {
            for (int c = i; c <= num; c++) {
                System.out.print(stroka);


            }
            System.out.println();
        }
    }
}