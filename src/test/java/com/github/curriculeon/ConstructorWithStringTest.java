package com.github.curriculeon;

import com.github.curriculeon.Person;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by leon on 7/15/2020.
 */
public class ConstructorWithStringTest {
    // Given
    private void test(String expected) {

        // When
        Person person = new Person(expected);

        // Then
        String actual = person.getName();
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void test0() {
        test(null);
    }
    @Test
    public void test1() {
        test("John Charles Cutler");
    }
    @Test
    public void test2() {
        test("John Africa Vincent Leaphart");
    }

    @Test
    public void test3() {
        test("Tuskegee & Guatemala");
    }

    @Test
    public void test4() {
        test("What is morality?");
    }
}
