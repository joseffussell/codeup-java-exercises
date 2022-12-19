import java.util.InputMismatchException;
import java.util.Scanner;
import java.lang.Math;

public class MethodExercises {
    public static int add(int n1, int n2) {
        return n1 + n2;
    }
    public static int subt(int n1, int n2) {
        return n1 - n2;
    }
    public static int mul(int n1, int n2) {
        return n1 * n2;
    }
    public static double div(double n1, double n2) {
        return n1 / n2;
    }
    public static int mod(int n1, int n2) {
        return n1 % n2;
    }

    public static int getInteger(int n1, int n2) {


        boolean hold = false;
        int input;
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a number between 1 and 10: ");

            if (scanner.hasNextInt()) {
                input = scanner.nextInt();
                if (input > n1 && input < n2) {
                    System.out.println("That's a working number " + input);
                    System.out.println(input);
                    return input;



                } else hold = false;

            } else hold = false;



        }
        while (hold == false);
        return 0;
    }

    public static String getFactorial(int n1, int n2) {


        boolean hold = false;
        int input;
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a number between 1 and 10: ");
            if (scanner.hasNextInt()) {
                input = scanner.nextInt();
                if (input > n1 && input < n2) {
                    int total = 1;
                    for (int i = 1; i <= input; i++) {
                        total *= i;
                        System.out.println(total);
                    }

                    return "input";

                } else hold = false;
            } else hold = false;
        }
        while (hold == false);
        return "0";
    }

    public static int getRandom(int num) {

        double rando = Math.floor(Math.random()*num+1);
        return (int) rando;
    }

    public static void rollDice() {
        String userInput = "y";
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a number for the sides of dice to roll: ");
            int numberSides = scanner.nextInt();
//        scanner.nextLine();
            int roll1 = getRandom(numberSides);
            int roll2 = getRandom(numberSides);
            int total = roll1 + roll2;
            System.out.println("This is the combination of two dice rolls of " + numberSides + " sided die for a total of " + total);
            System.out.print("Would you like to continue [Y/N]: ");
            userInput = scanner.next();
        } while (userInput.equalsIgnoreCase("y"));


    }

    public static void main(String[] args) {
//        System.out.println(add(4, 5));
//        System.out.println(subt(4, 5));
//        System.out.println(mul(4, 5));
//        System.out.println(div(4, 5));
//        System.out.println(mod(8, 3));
//        rollDice();
        multiplication(2, 4);
        int userInput = getInteger(1, 10);
//        String userFact = getFactorial(1, 10);


    }
    public static int multiplication(int num1, int num2) {
        int result = 0;
        while (num2 > 0) {
            result += num1;
            num2--;
            multiplication(num1, num2);
        }
        System.out.println(result);
        return result;
    }
}