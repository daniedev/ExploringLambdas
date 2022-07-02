package github.daniedev.collectionsassessment;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

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
        people.sort(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getLastName().compareTo(o2.getLastName());
            }
        });


        //Task2: Create a method that prints all elements in the list
        System.out.println("Printing all names");
        printAllNames(people);


        //Task3: Create a method that prints all people with last name beginning with C
        System.out.println("Printing people's last name beginning with C");
        printNamesConditionally(people, new Condition() {
            @Override
            public boolean isValid(Person p) {
                return p.getLastName().startsWith("C");
            }
        });


    }


    private static void printAllNames(List<Person> people) {
        for (Person p : people) {
            System.out.println(p);
        }
    }

    private static void printNamesConditionally(List<Person> people, Condition condition) {
        for (Person p : people) {
            if (condition.isValid(p))
                System.out.println(p);
        }
    }
}
