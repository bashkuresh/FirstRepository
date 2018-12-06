import java.util.Scanner;

public class TAsk109a {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Inter Amount of Lines");
        int x = s.nextInt();
        String sevenStars = "*******";
        String fourStars = "****";
        for (int i = 0; i <= x; i++) {
            if (i % 2 !=0) {
                System.out.println(sevenStars);
            } else {
                System.out.println(fourStars);
            }
        }



    }
}