package ro.fasttrackit.curs17.homeworkCurs17;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class PersonService {
    private final List<Person> persons = new ArrayList<>();

    public PersonService(Collection<Person> persons) {
        if (persons != null) {
            this.persons.addAll(persons);
        }
    }

    public List<String> fullName() {
        return persons.stream()
                .map(person -> person.getFirstName() + " " + person.getLastName())
                .collect(toList());
    }

    public List<Person> majorPersons() {
        return persons.stream()
                .filter(person -> person.getAge() > 17)
                .collect(toList());
    }

    public List<Person> personsFromOradea() {
        return persons.stream()
                .filter(person -> person.getCity().equals("Oradea"))
                .collect(toList());
    }

    public List<Person> fromOradeaOrCluj() {
        return persons.stream()
                .filter(person -> person.getCity().equals("Oradea") || person.getCity().equals("Cluj"))
                .collect(toList());
    }

    public List<String> firstNamesCapitalized() {
        return persons.stream()
                .map(person -> person.getFirstName().toUpperCase())
                .collect(toList());
    }

    public List<String> fullNameWithLastNameAbbreviated() {
        return persons.stream()
                .map(person -> person.getFirstName() + " " + person.getLastName().charAt(0) + ".")
                .collect(toList());
    }

    public List<Person> ageBetween() {
        return persons.stream()
                .filter(person -> person.getAge() > 18)
                .filter(person -> person.getAge() < 60)
                .collect(toList());
    }

    public List<Person> firstNameIsA() {
        return persons.stream()
                .filter(person -> person.getFirstName().startsWith("A"))
                .collect(toList());
    }

    public List<String> uniqueFirstNames() {
        return persons.stream()
                .map(Person::getFirstName).distinct()
                .collect(toList());
    }

    public List<Person> sortingByFirstName() {
        return persons.stream()
                .sorted(Comparator.comparing(Person::getFirstName))
                .collect(toList());
    }

    public List<Person> sortingByLastName() {
        return persons.stream()
                .sorted(Comparator.comparing(Person::getLastName))
                .collect(toList());
    }

    public List<Person> sortingByFNameLNameAge() {
        return persons.stream()
                .sorted(Comparator.comparing(Person::getFirstName)
                        .thenComparing(Person::getLastName)
                        .thenComparingInt(Person::getAge))
                .collect(toList());
    }

}
