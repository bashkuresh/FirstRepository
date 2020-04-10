import java.util.Scanner;

public class GuessingGame2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Print color of the dragon");
        String color = s.nextLine();
        System.out.println("Print past Tense Verb");
        String pastTenseVerb = s.nextLine();
        System.out.println("Print adjective");
        String adjective=s.nextLine();
        System.out.println("Print noun");
        String noun= s.nextLine();
        System.out.print("The " + color + " dragon " + pastTenseVerb + " at the " + adjective);
        System.out.println(" knight, who rode in on a sturdy, giant " + noun + ".");
    }
}
