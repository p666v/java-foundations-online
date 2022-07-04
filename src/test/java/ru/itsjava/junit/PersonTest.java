package ru.itsjava.junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Класс Person должен: ")
public class PersonTest {

    public static final String DEFAULT_NAME = "Pavel";
    public static final int DEFAULT_AGE = 40;
    public static final int NEW_AGE = 17;

    @DisplayName("корректно создаваться конструктором")
    @Test
    public void shouldHaveCorrectConstructor() {
        Person actualPerson = new Person(DEFAULT_NAME, DEFAULT_AGE);

        assertAll("actualPerson", () -> assertEquals(DEFAULT_NAME, actualPerson.getName()),
                () -> assertEquals(DEFAULT_AGE, actualPerson.getAge()));

    }

    @DisplayName("корректно изменять возраст")
    @Test
    public void shouldHaveCorrectUpdateAge() {
        Person actualPerson = new Person(DEFAULT_NAME, DEFAULT_AGE);
        actualPerson.setAge(NEW_AGE);

        assertEquals(NEW_AGE, actualPerson.getAge());

    }

    @DisplayName("корректно прибавлять год в день рождения")
    @Test
    public void shouldHaveCorrectBirthday() {
        Person actualPerson = new Person(DEFAULT_NAME, DEFAULT_AGE);
        actualPerson.birthday();

        assertEquals(DEFAULT_AGE + 1, actualPerson.getAge());

    }

    @DisplayName("корректно проверять возраст для покупки пива")
    @Test
    public void shouldHaveCorrectTakeBeer() {
        Person actualPerson = new Person(DEFAULT_NAME, DEFAULT_AGE);
        Person actualPerson2 = new Person(DEFAULT_NAME, NEW_AGE);

        actualPerson.takeBeer();
        actualPerson2.takeBeer();

        assertTrue(actualPerson.takeBeer());
        assertFalse(actualPerson2.takeBeer());

    }


}
