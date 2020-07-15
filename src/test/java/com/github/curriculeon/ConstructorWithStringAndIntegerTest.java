package com.github.curriculeon;

import com.github.curriculeon.Person;
import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.Date;

/**
 * Created by leon on 7/15/2020.
 */
public class ConstructorWithStringAndIntegerTest {
    // Given
    private void test(Integer expectedAge, String expectedName) {

        // When
        Person person = new Person(expectedName, expectedAge);

        // Then
        Integer actualAge = person.getAge();
        String actualName = person.getName();

        Assert.assertEquals(expectedAge, actualAge);
        Assert.assertEquals(expectedName, actualName);
    }
    @Test
    public void test0() {
        test(null, null);
    }

    @Test
    public void test1() {
        test(1, "Leon");
    }

    @Test
    public void test2() {
        test(2, "Hunter");
    }

    @Test
    public void test3() {
        LocalDate birthDate = LocalDate.of(1993, 4, 23);
        Integer age = Period.between(birthDate, new Date().toInstant()
                .atZone(ZoneId.systemDefault())
                .toLocalDate()).getYears();
        test(age, "Leon Hunter");
    }
}
