import java.util.Scanner;
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        int myFavoriteNumber = 34;
        System.out.println(myFavoriteNumber);

        String myString = "pizza is good";
        System.out.println(myString);

        double myStringWithPi = 3.14159;

        myString = String.valueOf(myStringWithPi);
        System.out.println(myString);

//      Long myNumber = 123L;
//      System.out.println(myNumber);

//      float myNumber = 3.14;

//        int x = 5;
//        System.out.println(x++); // increments after
//        System.out.println(x); // prints said increment

//        int x = 5;
//        System.out.println(++x); //prints before execution
//        System.out.println(x); //re-print

//        String theNumberThree = "three";
//        Object o = theNumberThree;
//        int three = (int) o; //casting error

        int x = 10;
        int y = 2;
        x /= y;
        y -= x;
        System.out.println(x);
        System.out.println(y);

        Scanner scanner = new Scanner(System.in);




    }
}

