import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        double pi = 3.14159;
        System.out.println("The value of pi is approximately " + pi);

        Scanner scanner = new Scanner(System.in);
//
//        int giveNumber = scanner.nextInt();
//        System.out.println(giveNumber);
//
//        String firstWord = scanner.next();
//        String secondWord = scanner.next();
//        String thirdWord = scanner.next();
//        System.out.println("Your first word was: " + firstWord + " Your second word was: " + secondWord + " Your third word was: " + thirdWord);

        String enterSentence = scanner.nextLine();
        System.out.println(enterSentence);
    }
}
