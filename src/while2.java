import java.util.Scanner;

    public class while2 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int max = 0;

            while(scanner.hasNext()) {
                int num = scanner.nextInt();
                if(num > max && num % 4 ==0){
                    max = num;
                }
            }
            System.out.println(max);
        }
    }
