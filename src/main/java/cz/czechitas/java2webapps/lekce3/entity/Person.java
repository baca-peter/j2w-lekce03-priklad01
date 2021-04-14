package cz.czechitas.java2webapps.lekce3.entity;

import java.time.LocalDate;
import java.time.Period;

public class Person {

    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;

    public Person(String firstName, String lastName, LocalDate dateOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public int getAge() {
        return Period.between(getDateOfBirth(), LocalDate.now()).getYears();
    }
}
