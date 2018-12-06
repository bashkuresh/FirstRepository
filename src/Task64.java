import java.util.Scanner;

public class Task64 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        // Дано четырехзначное число. Если оно читается слева направо и справа налево одинаково, то вывести yes, иначе no.
        System.out.println("Inter 4 dig num");

        System.out.println("inter 1st Dig");
        int x1 = s.nextInt();
        System.out.println("inter 2d Dig");
        int x2 = s.nextInt();
        System.out.println("inter 3d Dig");
        int x3 = s.nextInt();
        System.out.println("inter 4th Dig");
        int x4 = s.nextInt();
        if (x1==x2&&x1==x3&&x1==x4){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }
    }
}
