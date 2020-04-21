package co.za.codeboss;

import java.util.*;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        final int DAYS_PER_WEEK = 7;

        var list = List.of("hello", "world", "");
        var words = new String[] { "HELLO", "WORLD"};
        Comparable<String>[] comparables = words; // String implements Comparable
        List<Integer> fibNumbers = Arrays.asList(0, 1, 1, 2, 3, 5, 8, 13);
        List<Integer> randomNumbers = new ArrayList<>(); // Diamond syntax

        // foreach
        for (var item: list ) {
            System.out.println(item);
            if (!item.isBlank()) {
                System.out.println(item);
            }
        }

        // instanceof
        var dillan = new Person("Dillan");
        dillan.say();
        if(dillan instanceof Person) {
            System.out.println(dillan instanceof Person);
        }

        // params
        System.out.println(multiply(1, 2,3,4,5));

        // Types
        Class<?> personClass = Person.class;
        System.out.println(personClass.getSimpleName());

        /*Lambda Expressions*/
        Runnable r  = ()  -> System.out.println("Running");
        r.run();

        Function<Integer, Integer> function = x -> {
            var result = multiply(x+x,x);
            return result;
        };
        System.out.println(function.apply(5));

        // Functional Interfaces
        IFunctionalInterface func = name -> name.equals();
        func.accept("Dillan");

        // Method Reference
        IFunctionalInterface nameChanger = dillan::accept;
        nameChanger.accept("John")

        // Java Streams (LINQ)
        fibNumbers.forEach(x -> System.out.print(x + "\t"));
        System.out.println();
        List<Person> people = Arrays.asList(
                dillan,
                new Person("David"),
                new Person("Danielle"),
                new Person("Daniel"),
                new Person("Anna"),
                new Person("Zacharias")
        );

        System.out.println("-- Filter People --");
        Stream<Person> filteredPeople = people.stream().filter(p -> p.getName().contains("D") );
        filteredPeople.forEach( p -> System.out.print(p.getName() + "\t"));
        System.out.println();

        // Sorting with Comparator
        people.sort(Person.PersonNameComparator);
        System.out.println("-- Sorted People --");
        people.forEach( p -> System.out.print(p.getName() + "\t"));
        System.out.println();
        // Sorting with Comparator class
        people.sort(new PersonNameComparatorDescending());
        System.out.println("-- Sorted People - descending --");
        people.forEach( p -> System.out.print(p.getName() + "\t"));


    }

    // params
    private static int multiply(int first, int... rest) {
        int temp = first;
        for(int i : rest) { // legal because rest is actually an array
            temp *= i;
        }
        return temp;
    }

}


