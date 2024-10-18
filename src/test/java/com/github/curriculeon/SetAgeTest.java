package com.github.curriculeon;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by leon on 7/15/2020.
 */
public class SetAgeTest {
    private void test(Integer expected) {
        // Given
        Person person = new Person();

        // When
        person.setAge(expected);
        Integer actual = person.getAge();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test0() {
        test(null);
    }


    @Test
    public void test1() {
        test(1);
    }



    @Test
    public void test2() {
        test(2);
    }



    @Test
    public void test3() {
        test(3);
    }



    @Test
    public void test4() {
        test(Integer.MIN_VALUE);
    }


    @Test
    public void test5() {
        test(Integer.MAX_VALUE);
    }
}
