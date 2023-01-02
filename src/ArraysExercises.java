import java.util.Arrays;

import static java.util.Arrays.copyOf;

public class ArraysExercises {

    public static Person[] addPersons(Person[] arr, Person person) {
        int newLength = arr.length + 1;
        Person[] people = new Person[newLength];
        System.arraycopy(arr, 0, people, 0, arr.length);
        people[newLength - 1] = person;
        return people;
    }



    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));
        Person[] people = new Person[3];
        people[0] = new Person("Matt");
        people[1] = new Person("Nathan");
        people[2] = new Person("Daniel");
        for (int i = 0; i < people.length; i++) {
            System.out.println(people[i].getName());
        }
        Person person4 = new Person("Dooo");
        Person[] newPeople = addPersons(people, person4);
    }
}