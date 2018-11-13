import java.util.Scanner;

public class Task18 {
    public static void main(String[] args) {//Пользователь вводит сторону квадрата. Найдите периметр и площадь квадрата.
        Scanner in = new Scanner(System.in);
        System.out.println("Inter side of square");
        int a = in.nextInt();
        int P = a*4;
        System.out.println("Perimetr of square");
        System.out.println(P);
        int S = a*a;
        System.out.println("Ploshad of square");
        System.out.println(S);
    }
}
