import java.util.Scanner;

public class Task110A {
    public static void main(String[] args) {
        String s = "";
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        for (int i = 0; i<m; i++) {
            s = s + "AAABBB";
        }

        for (int i = 0; i< n; i++) {
            if(i%2==0) {
                System.out.println(s);
            } else  {
                System.out.println(new StringBuilder(s).reverse().toString());
            }
        }
    }
}
