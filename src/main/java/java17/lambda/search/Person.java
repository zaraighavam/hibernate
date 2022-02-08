package java17.lambda.search;

import java.time.LocalDate;

public class Person {

    public enum Sex {
        MALE, FEMALE
    }

    String name;
    LocalDate birthday;
    Sex gender;
    String emailAddress;
    int age;
    private Sex test;

    public Person() {
        super();
    }

    public Person(String name, int age, Sex gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public int getAge() {
       return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void printPerson() {
       System.out.println("printPerson");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public Sex getGender() {
        return gender;
    }

    public void setGender(Sex gender) {
        this.gender = gender;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public static int compareByAge(Person a, Person b) {
        return a.birthday.compareTo(b.birthday);
    }

}
