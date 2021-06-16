package ro.fasttrackit.curs17.homeworkCurs17;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.lang.annotation.Target;
import java.util.List;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;


class PersonServiceTest {

    @Test
    @DisplayName("WHEN majorPersons is used THEN will retun persons with age > 17")
    void majorPersons() {
        //SETUP
        PersonService service = populateService();
        //RUN
        List<Person> result = service.majorPersons();
        //ASSERT
        assertThat(result).isEqualTo(List.of(
                new Person("George", "Ban", 36, "Oradea"),
                new Person("Gelu", "Parvan", 44, "Oradea")
        ));
    }

    @Test
    @DisplayName("WHEN fullNameWithLastNameAbbreviated is used THEN will return name and last name abbreviated")
    void fullNameWithLastNameAbbreviated(){
        //SETUP
        PersonService service = populateService();
        //RUN
        List<String> result = service.fullNameWithLastNameAbbreviated();
        //ASSERT
        assertThat(result).isEqualTo(List.of("Ana B.", "George B.", "Gelu P."));
    }

    @Test
    @DisplayName("WHEN fullName is used THEN will return first name and last name")
    void fullName() {
        //SETUP
        PersonService service = populateService();
        //RUN
        List<String> result = service.fullName();
        //ASSERT
        assertThat(result).isEqualTo(List.of(
                "Ana Bud",
                "George Ban",
                "Gelu Parvan"
        ));

    }

    private PersonService populateService() {
        return new PersonService(List.of(
                new Person("Ana", "Bud", 13, "Olt"),
                new Person("George", "Ban", 36, "Oradea"),
                new Person("Gelu", "Parvan", 44, "Oradea")
        ));
    }


}