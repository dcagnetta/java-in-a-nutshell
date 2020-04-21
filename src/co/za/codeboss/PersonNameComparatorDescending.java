package co.za.codeboss;

import java.util.Comparator;

public class PersonNameComparatorDescending implements Comparator<Person> {

    @Override
    public int compare(Person person1, Person person2) {

        String p1Name = person1.getName().toUpperCase();
        String p2Name = person2.getName().toUpperCase();

        return p2Name.compareTo(p1Name);
    }
}
