
import java.util.Scanner;
class main1 {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner (System.in);
        boolean finish = false;
        boolean output = true;
        int i = sc.nextInt();
        int y = -1;
        int odd = 0;
        if (i == 0 ){
            finish = true;
            output = false;
        }
        else {
            y = sc.nextInt();
        }

        while (!finish) {
            if (y == 0) {
                finish = true;
                break;
            }
            if ( (i<=y) && (odd >= 0) && !finish) {
                odd++;

            }
            else if ( (i>=y) && (odd <= 0) && !finish) {
                odd--;
            }
            else if (!finish)  {
                output = false;
            }
            i=y;
            if (sc.hasNextInt()) {
                y = sc.nextInt();
            }
            else {
                finish =true;
            }
        }
        System.out.println (output);
    }
}