package shapes;
import util.Input;
import java.util.Scanner;

public class CircleApp {

    public static void cirApp() {
        Input input = new Input(new Scanner(System.in));
        System.out.println("Give me the radius of a circle");
        double circle = input.getDouble();
        Circle newCir = new Circle(circle);
        newCir.getCircumference();
        newCir.getArea();
        boolean bool = input.yesNo();
        System.out.println(bool);
        if (bool == true) cirApp();


    }

    public static void main(String[] args) {
        cirApp();

    }
}