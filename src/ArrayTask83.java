import java.util.Scanner;

public class ArrayTask83 {
    public static void main(String[] args) {
        System.out.println("Inter number");
        Scanner s = new Scanner(System.in);
        //Выполните сортировку массива следующими тремя способами:
        // сортировкой выбором,
        // сортировкой вставками,
        // сортировкой обменом.
       // int [] arr=new int[]{1,2,3,4,5};
        int N= s.nextInt();
        int sum=0;
        for (int i=1;i<=10;i++){
            System.out.printf("%d x %d = %d%n",N,i,N*i);//d simple integer

        }


    }
}
