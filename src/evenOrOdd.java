
import java.util.*;

public class evenOrOdd {

    public static void main(String[] args) {
            Scanner s = new Scanner(System.in);

        int num ;
            while(s.hasNext() ){
                num = s.nextInt();
                if(num % 2 == 0 && num != 0) {
                    System.out.println("even");

                }else if(num % 2 != 0 && num != 0) {
                    System.out.println("odd");
                }else{
                    break;
                }
                }
            }
        }


