import java.util.Scanner;

public class Option {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        String n= scaner.nextLine();
        if  (n.equals("-en")){
            System.out.println("Опция для Английскго Языка");
        }
        else if (n.equals("-es")){
            System.out.println("Опция для Испанского Языка");
        }
        else System.out.println("Неизвестная Опция");
    }
}
