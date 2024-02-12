import java.util.Scanner;

public class PartyAffiliation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose your party affiliation:");
        System.out.println("D - Democrat");
        System.out.println("R - Republican");
        System.out.println("I - Independent");
        System.out.print("Your choice: ");
        String choice = scanner.next().toUpperCase();

        String result;
        switch (choice) {
            case "D":
                result = "Democratic Donkey";
                break;
            case "R":
                result = "Republican Elephant";
                break;
            case "I":
                result = "Independent Person";
                break;
            default:
                result = "Other";
        }

        System.out.println("You get a " + result + ".");
    }
}
