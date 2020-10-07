package ru.job4j.lambda.higherOrderFunctions;

import java.util.ArrayList;
import java.util.function.Predicate;

public class PhoneDictionary {
    private ArrayList<Person> persons = new ArrayList<>();

    public void add(Person person) {
        this.persons.add(person);
    }

    public ArrayList<Person> find(String key) {
        Predicate<Person> combine = new Predicate<>() {
            @Override
            public boolean test(Person person) {
                return (person.getAddress().contains(key)
                        || person.getName().contains(key)
                        || person.getPhone().contains(key)
                        || person.getSurname().contains(key));
            }
        };
        ArrayList<Person> result = new ArrayList<>();
        for (Person person : persons) {
            if (combine.test(person)) {
                result.add(person);
            }
        }
        return result;
    }
}

