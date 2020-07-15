package com.github.curriculeon;

import com.github.curriculeon.Person;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by leon on 7/15/2020.
 */
public class ConstructorWithIntegerTest {
    // Given
    private void test(Integer expected) {

        // When
        Person person = new Person(expected);

        // Then
        Integer actual = person.getAge();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test0() {
        test(null);
    }

    @Test
    public void test1() {
        test(0);
    }

    @Test
    public void test2() {
        test(1);
    }


    @Test
    public void test3() {
        test(2);
    }


    @Test
    public void test4() {
        test(5);
    }


    @Test
    public void test5() {
        test(Integer.MAX_VALUE);
    }

    @Test
    public void test6() {
        test(Integer.MIN_VALUE);
    }
}
