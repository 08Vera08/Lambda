package com.company;

import PersonComparator.PersonComparator;
import com.company.Person;

import java.util.Collections;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        PersonComparator comp = new PersonComparator();
        LinkedList<Person> list = new LinkedList<Person>();
        list.add(new Person("James", "Van Dam", 5));
        list.add(new Person("Hretta", "Tunberg", 20));
        list.add(new Person("Mohamed", "Petrov Egorov", 22));
        list.add(new Person("John", "Murtazaliev", 7));
        list.add(new Person("Jesus", "Pavlov", 18));
        list.add(new Person("Rotor", "Pavlov", 4));
        Collections.sort(list, comp);
        list.removeIf(x -> x.getAge() < 18);
        System.out.println(list);
    }
}