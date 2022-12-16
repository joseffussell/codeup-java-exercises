import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
//        for(int i = 5; i <= 15; i++) {
//            System.out.println(i);
//        }
//
//        for(int i = 100; i >= -10; i-= 5) {
//            System.out.println(i);
//        }
//        int number = 2;
//        for(int i = 1; i < 1_000_000; i++) {
//            int multiply = number * i;
//            System.out.println(multiply);
//        }
//
//        for (int i = 0; i <= 100; i++) {
//            if (i % 3 == 0 && i % 5 == 0) {
//                System.out.println("FizzBuzz" + i);
//            } else if (i % 3 == 0) {
//                System.out.println("Fizz" + i);
//            } else if (i % 5 == 0) {
//                System.out.println("Buzz" + i);
//            }
//        }
        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Enter a number: ");
//        int userInput = scanner.nextInt();
//        for (int i = 0; i <= userInput; i++) {
//            if (i == 0) {
//                System.out.println("Here is your table!");
//                System.out.println("number | squared | cubed");
//            }else {
//                System.out.println(i + "      | " + i*i + "       | " + i*i*i);
//            }
//        }

        System.out.print("Enter your grade: ");
        int userInput = scanner.nextInt();
        if (userInput >= 88 & userInput <= 100) {
            System.out.println("You got an A " + userInput);
        } else if (userInput >= 80 && userInput <= 87) {
            System.out.println("You got an B " + userInput);
        } else if (userInput >= 67 && userInput <= 79) {
            System.out.println("You got an C " + userInput);
        } else if (userInput >= 60 && userInput <= 66) {
            System.out.println("You got an D " + userInput);
        } else {System.out.println("You got an F " + userInput);
        }
    }
}

