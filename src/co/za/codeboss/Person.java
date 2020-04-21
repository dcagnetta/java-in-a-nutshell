package co.za.codeboss;

import java.util.Comparator;

public class Person implements ISaySomething, IFunctionalInterface {

    private String name;

    Person(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }

    static Comparator<Person> PersonNameComparator  = (person1, person2) -> {

        String p1Name = person1.getName().toUpperCase();
        String p2Name = person2.getName().toUpperCase();

        //ascending order
        return p1Name.compareTo(p2Name);

        //descending order
        //return fruitName2.compareTo(fruitName1);
    };

    public void say() {
        System.out.println("override default");
    }

    @Override
    public boolean accept(String name) {
        this.name = name;
    }
}


