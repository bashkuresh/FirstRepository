package bot;

import java.util.Scanner;

public class simpleBot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        System.out.println("Hello! My name is Aid.");
        System.out.println("I was created in 2018.");
        System.out.println("Please, remind me your name.");

        String yourName=scanner.next();
        // reading a name

        System.out.println("What a great name you have, "+ yourName+"!");
        System.out.println("Let me guess your age.");
        System.out.println("Enter remainders of dividing your age by 3, 5 and 7.");

        // reading all remainders
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int yourAge = (a * 70 + b * 21 + c * 15) / 105;
        while ((yourAge % 3 != a) || (yourAge % 5 != b) || (yourAge % 7 != c)) {
            yourAge++;
        }

        System.out.println("Your age is "+yourAge+" that's a good time to start programming!");
    }
}