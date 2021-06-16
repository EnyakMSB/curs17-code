package ro.fasttrackit.curs17.homeworkCurs17;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        PersonService personService = new PersonService(List.of(
                new Person("Ana", "Bud", 33, "Olt"),
                new Person("Mihai", "Pop", 31, "Oradea"),
                new Person("Mihai", "Ungur", 44, "Cluj"),
                new Person("Mihai", "Rat", 55, "Cluj"),
                new Person("George", "Ban", 36, "Oradea"),
                new Person("Laurentiu", "Duta", 41, "Bucuresti"),
                new Person("Ecaterina", "Teodoroiu", 66, "Oradea"),
                new Person("Darius", "Georgescu", 23, "Tulcea"),
                new Person("Carol", "Bujor", 26, "Arad"),
                new Person("Gelu", "Parvan", 44, "Oradea")
        ));
        System.out.println("Full Names :" + personService.fullName());
        System.out.println("Major persons: " + personService.majorPersons());
        System.out.println("Persons from Oradea : " + personService.personsFromOradea());
        System.out.println("Persons from Oradea or Cluj : " + personService.fromOradeaOrCluj());
        System.out.println("First Names Capitalized : " + personService.firstNamesCapitalized());
        System.out.println("Full Name with last name abbreviated : " + personService.fullNameWithLastNameAbbreviated());
        System.out.println("persons with 18 < age < 60 : " + personService.ageBetween());
        System.out.println("persons having first name starting with A : " + personService.firstNameIsA());
        System.out.println("first names UNIQUELY : " + personService.uniqueFirstNames());
        System.out.println("sort the persons by first name " + personService.sortingByFirstName());
        System.out.println("sort the persons by last name " + personService.sortingByLastName());
        System.out.println("sort the persons by first name, last name and then age : " +
                personService.sortingByFNameLNameAge());
    }
}
