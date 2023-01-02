package movies;

import util.Input;

import java.util.Arrays;
import java.util.Scanner;

public class MoviesApplication {

    public static int num = 100;
    public static Movie[] moviesArr = Arrays.copyOf(MoviesArray.findAll(), 100);
    public static void showMovies() {
        Input movie = new Input(new Scanner(System.in));

        System.out.println("0 - exit");
        System.out.println("1 - view all movies");
        System.out.println("2 - view movies in the animated category");
        System.out.println("3 - view movies in the drama category");
        System.out.println("4 - view movies in the horror category");
        System.out.println("5 - view movies in the scifi category");
        System.out.println("6 - view movies in the musical category");
        System.out.println("7 - view movies in the comedy category");
        System.out.println("8 - to add your own movie and category");
        int choice = movie.getInt();

        for (int i = 0; i < moviesArr.length; i++) {
            if (choice == 0) {

            } else if (choice == 1) {
                System.out.println(moviesArr[i].getName());
            } else if (choice == 2 && moviesArr[i].getCategory().equals("animated")) {
                System.out.println(moviesArr[i].getName());
            } else if (choice == 3 && moviesArr[i].getCategory().equals("drama")) {
                System.out.println(moviesArr[i].getName());
            } else if (choice == 4 && moviesArr[i].getCategory().equals("horror")) {
                System.out.println(moviesArr[i].getName());
            } else if (choice == 5 && moviesArr[i].getCategory().equals("scifi")) {
                System.out.println(moviesArr[i].getName());
            } else if (choice == 6 && moviesArr[i].getCategory().equals("musical")) {
                System.out.println(moviesArr[i].getName());
            } else if (choice == 7 && moviesArr[i].getCategory().equals("comedy")) {
                System.out.println(moviesArr[i].getName());
            } else if (choice == 8) {
                addMovies();
            }

        }

        boolean cont = movie.yesNo();
        if (cont == true) {
            showMovies();
        }
    }

    public static void addMovies() {
        num++;
        Input movie = new Input(new Scanner(System.in));
        System.out.println("Input the movie name: ");
        String name = movie.getString();
        System.out.println("1 - set to animated category");
        System.out.println("2 - set to drama category");
        System.out.println("3 - set to horror category");
        System.out.println("4 - set to scifi category");
        System.out.println("5 - set to musical category");
        System.out.println("6 - set to comedy category");
        int choice = movie.getInt();

        moviesArr = Arrays.copyOf(moviesArr, num);

        if (choice == 1) {
            moviesArr[num - 1] =  new Movie(name, "animated");

        } else if (choice == 2) {
            moviesArr[num - 1] = new Movie(name, "drama");

        } else if (choice == 3) {
            moviesArr[num - 1] = new Movie(name, "horror");

        } else if (choice == 4) {
            moviesArr[num - 1] = new Movie(name, "scifi");

        } else if (choice == 5) {
            moviesArr[num - 1] = new Movie(name, "musical");

        } else if (choice == 5) {
            moviesArr[num - 1] = new Movie(name, "comedy");

        }
        showMovies();
    }

    public static Movie[] addMovies(Movie[] arr, Movie movie) {
        System.out.println(arr.length);
        int newLength = arr.length + 1;

        Movie[] movies = new Movie[newLength];

        System.arraycopy(arr, 0, movies, 0, arr.length);

        movies[newLength - 1] = movie;
        for (Movie num : movies) {
            System.out.println(num);
        }
        return movies;
    }

    public static void main(String[] args) {
        showMovies();
    }
}