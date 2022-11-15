import java.util.Scanner;
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        int myFavoriteNumber = 34;
        System.out.println(myFavoriteNumber);

//        String myString = "This is a string";
//        System.out.println(myString);

//        char c = myString.charAt(0);
//        System.out.println("First letter in myString is: " +c);

        double myString = 3.14159;
        System.out.println(myString);

//        long myNumber = 3.14; //data type expected is a double instead of a long
//        System.out.println(myNumber); //myNumber is not initialized error
//        long myNumber = 123L;
//        System.out.println(myNumber); //L does not come through on sys out.
//        long myNumber = 123;
//        System.out.println(myNumber); //I feel 123 works because java doesn't have to parse a decimal
//          float myNumber = 3.14; //incompatible types error
//        int x = 5;
//        System.out.println(x++); //increments after code is run
//        System.out.println(x);

//        int x = 5;
//        System.out.println(++x); //increments before code is run
//        System.out.println(x);

        String theNumberThree = "three";
        Object o = theNumberThree;
        int three = (int) o;



    }
}

