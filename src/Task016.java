import java.util.Scanner;
//S = (x + 1) + (x + 1)(x + 2) + (x + 1)(x + 2)(x + 3) + . . . + (x + 1)(x + 2)(x + 3). . .(x + n)
public class Task016 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Inter Var N");
        int n= in.nextInt();
        System.out.println("Inter Var X");
        int x = in.nextInt();
        int P=1;
        int S=0;
        for(int i=1; i<n; i++){
            S = (x+1);
            P= P*(x+i);

            System.out.println(S=S+(x+i)*P);
            }

        }

    }


