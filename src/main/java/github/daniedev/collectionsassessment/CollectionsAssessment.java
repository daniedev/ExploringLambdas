package github.daniedev.collectionsassessment;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class CollectionsAssessment {

    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Charles", "Dickens", 60),
                new Person("Lewis", "Carroll", 55),
                new Person("Thomas", "Carlyle", 55),
                new Person("Charlotte", "Bronte", 55),
                new Person("Matthew", "Arnold", 55)
        );

        //Task1: Sort list by last name
        people.sort((p1, p2) -> p1.getLastName().compareTo(p2.getLastName()));


        //Task2: Create a method that prints all elements in the list
        System.out.println("Printing all names");
        printNamesConditionally(people, p -> true);


        //Task3: Create a method that prints all people with last name beginning with C
        System.out.println("Printing people's last name beginning with C");
        printNamesConditionally(people, p -> p.getLastName().startsWith("C"));


    }

    private static void printNamesConditionally(List<Person> people, Predicate<Person> predicate) {
        for (Person p : people) {
            if (predicate.test(p))
                System.out.println(p);
        }
    }
}
