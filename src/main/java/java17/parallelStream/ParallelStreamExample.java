package java17.parallelStream;

import java17.lambda.search.Person;

import java.util.*;
import java.util.concurrent.ConcurrentMap;
import java.util.stream.Collectors;

public class ParallelStreamExample {
    public static int testParallel(List<Person> personList){
      return   personList.parallelStream().
                filter(person -> person.getGender()== Person.Sex.FEMALE)
                .mapToInt(Person::getAge)
                .sum();
    }
    public static ConcurrentMap<Person.Sex, List<Person>> testGrouping(List<Person> personList){
       return personList.parallelStream()
                .filter(person -> person.getGender()== Person.Sex.MALE)
                .collect(Collectors.groupingByConcurrent(Person::getGender));
    }
    public static void testParallelSorting(String[] args){
        Integer[] temp={1,2,3,4,5,6,7,8};
        List<Integer> data=Arrays.asList(temp);
        data.stream()
                .forEach(p->System.out.print(p));
        System.out.println("---------------");
        Comparator<Integer> comparator = Integer::compare;
        Comparator<Integer> reserved = comparator.reversed();
        Collections.sort(data,reserved);
        data.stream()
                .forEach(p->System.out.print(p));
        System.out.println("---------------");
        data.parallelStream()
                .forEach(p->System.out.print(p));
        System.out.println("---------------");


    }
    public static void testConcurrentModification(List<String> personList){
        personList.stream()
                .peek( s->personList.add("test"))
                .reduce((a,b)->a+b)
                .get();
    }
    public static void main(String[] args) {
        List<String> temp = new ArrayList<>();
        temp.add("test");
        temp.add("test1");
        temp.add("test23");
//        List<String> strings = testCollect(temp);
        testConcurrentModification(temp);
    }

}
