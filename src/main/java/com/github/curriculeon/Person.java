package com.github.curriculeon;

/**
 * Created by leon on 2/12/18.
 */
public class Person {
    public String name = "";
    public String dob;
    public Integer age;
    public String address;
    public String account;
    public String test;

    public Person(String name, String dob, String address, String account, String test) {
        this.name = name;
        this.dob = dob;
        this.address = address;
        this.account = account;
        this.test = test;
    }


    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getTest() {
        return test;
    }

    public void setTest(String test) {
        this.test = test;
    }

    public Person() {
        this("", Integer.MAX_VALUE);
    }


    public Person(Integer age) {
        this.age = age;
    }

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, Integer age) {
        this.name=name;
        this.age=age;
    }


    public void setName(String name) {
        this.name= name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public Integer getAge() {
        return this.age;
    }
}
