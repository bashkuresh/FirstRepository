import java.util.Scanner;

public class Task110 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Inter Amount of Lines");
        int x = s.nextInt();
        System.out.println("Inter Amount of Paragraphs");
        int y = s.nextInt();
        String m= "AAA";
        String z="BBB";
        for (int i=0;i<=x;i++){
                m=m+z;
            System.out.print(m);
        }System.out.println();
for (int i=0;i<y;i++){
    z=m+z;
    System.out.print(m);
}
        System.out.println();

    }
}
