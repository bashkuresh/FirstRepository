import java.util.Scanner;// Напишите программу, которая вычислит простые числа в пределах от 2 до 100.
        //(Опционально) Дополните программу так, чтобы она вычисляла составные числа.

public class NewClassArray2A {
    public static void main(String[] args) {
        int f;
        for (int i = 2; i < 101; i++) {
            f=0;
           for(int k=1;k<=i;k++){
               if(i%k==0){
                   f++;
               }
           }
           if(f==2){
               System.out.println(i);
           }

        }

    }
}
