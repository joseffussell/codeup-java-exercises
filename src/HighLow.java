import java.util.Scanner;
import java.lang.Math;

public class HighLow {

    public static int getRandom() {
        double random = Math.floor(Math.random()*100+1);
        return (int) random;
    }

    public static void main(String[] args) {

        int random = getRandom();
        int count = 0;
        do {

            Scanner scanner = new Scanner(System.in);
            System.out.println("You have 5 chances to choose a number between 1 and 100: ");
            int userInput = scanner.nextInt();
            scanner.nextLine();
            if (random == userInput) {
                System.out.println("You got it! " + userInput);
                count = 5;
            } else if (random > userInput) {
                System.out.println("That's too low");
                count++;
            } else if (random < userInput) {
                System.out.println("That's too high");
                count++;
            }
        } while (count < 5);
    }
}