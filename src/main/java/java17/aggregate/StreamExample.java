package java17.aggregate;

import java17.lambda.search.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamExample {
    public static void testStream(List<Person> personList) {
        personList.stream().forEach(person -> System.out.println(person.getAge()));
    }

    public static void testFilterByStream(List<Person> personList) {
        personList.stream()
                .filter(person -> person.getGender() == Person.Sex.FEMALE)
                .forEach(person -> System.out.println(person.getName()));
    }

    public static void testCalculateByStream(List<Person> personList) {
        System.out.println(personList.stream()
                .filter(person -> person.getGender() == Person.Sex.MALE)
                .mapToInt(Person::getAge)
                .average()
                .getAsDouble());
    }

    public static void testReduction(List<Person> personList) {
        personList.stream()
                .map(Person::getAge)
                .reduce(0, (a, b) -> a + b);
    }

    public static List<String> testCollect(List<Person> personList) {
        return personList.stream()
                .map(Person::getName)
                .collect(Collectors.toList());
    }

    public static Map<Person.Sex, List<Person>> groupingBy(List<Person> personList) {
        return personList.stream()
                .collect(Collectors.groupingBy(Person::getGender));
    }

    public static Map<Person.Sex,List<String>> groupingBy2(List<Person> personList){
        return personList.stream()
                .collect(Collectors.groupingBy(Person::getGender,
                        Collectors.mapping(Person::getName, Collectors.toList())));

    }
    public static Map<Person.Sex,Integer> groupBy3(List<Person> personList){
       return  personList.stream()
                .collect(Collectors.groupingBy(Person::getGender,
                        Collectors.reducing(0,Person::getAge,Integer::sum)));
    }

    public static Map<Person.Sex,Double> groupBy4(List<Person> personList){
       return  personList.stream()
                .collect(Collectors.groupingBy(Person::getGender,
                        Collectors.averagingInt(Person::getAge)));
    }
    public static void main(String[] args) {
        List<Person> temp = new ArrayList<>();
        temp.add(new Person("test", 10, Person.Sex.MALE));
        temp.add(new Person("test2", 20, Person.Sex.FEMALE));
        temp.add(new Person("test3", 25, Person.Sex.FEMALE));
//        List<String> strings = testCollect(temp);
        groupBy4(temp);
    }
}
