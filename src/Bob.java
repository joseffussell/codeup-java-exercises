import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        String sure = "Sure";
        String chill = "Whoa, chill out!";
        String fine = "Fine. Be that way!";
        String what = "Whatever.";
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        int strl = userInput.length();

        if (userInput.endsWith("?")) {
            System.out.println(sure);
        } else if (userInput.endsWith("!")) {
            System.out.println(chill);
        } else if (strl == 0) {
            System.out.println(fine);
        } else {
            System.out.println(what);
        }
    }
}
