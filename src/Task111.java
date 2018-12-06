import java.util.Scanner;

public class Task111 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        String row = "";
        String rowB = "";



        for(int i =0; i<2*n; i++) {
            row+="A";
        }

        for(int i=1; i<2*n-1; i++ ){
            rowB+="B";
        }
        System.out.println(row);
        for(int i = 1; i<n-1;i++) {
            System.out.println("A" + rowB + "A");
        }
        System.out.println(row);
        //12221212121

    }

}
// String stroka ="";
//        for (int i=0; i<x;i++){
//            stroka = stroka + "*";
//        }for (int i=0;i<y;i++){
//            System.out.println(stroka);