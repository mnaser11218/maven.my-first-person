package com.github.curriculeon;

import com.github.curriculeon.Person;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by leon on 7/15/2020.
 */
public class NullaryConstructorTest {
    @Test
    public void test() {
        // Given
        String expectedName = "";
        Integer expectedAge = Integer.MAX_VALUE;

        // When
        Person person = new Person();

        // Then
        String actualName = person.getName();
        Integer actualAge = person.getAge();

        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedAge, actualAge);
    }

}
