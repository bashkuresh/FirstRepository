import java.util.Scanner;
//Вывести на экран n единиц, затем 2n двоек, затем 3n троек. Число n вводит пользователь.
public class Task106 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Inter n which equils 1");
        int n = s.nextInt();
        System.out.println("Inter n which equils 2");
        int n2 = s.nextInt();
        System.out.println("Inter n which equils 3");
        int n3 = s.nextInt();
        String stroka = "";
        for (int i = 1; i <= n; i++) {
            stroka = stroka + "1";
            System.out.println(stroka);
        }

        for (int i = 1; i <= n2; i++) {
            stroka = stroka + "2";
            System.out.println(stroka);
        }

        for (int i = 1; i <= n3; i++) {
            stroka = stroka + "3";
            System.out.println(stroka);
        }
    }
}