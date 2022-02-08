package java17.lambda.search;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SearchPerson {
    interface Filter {
        boolean search(Person p);
    }

    public boolean findPeople(Person p,Filter f){
        return f.search(p);
    }
    public void searchByComparator(List<Person> personList){
        class PersonAgeComparator implements Comparator<Person> {
            public int compare(Person a, Person b) {
                return a.getBirthday().compareTo(b.getBirthday());
            }
        }
        Person[] rosterAsArray = personList.toArray(new Person[personList.size()]);
        Arrays.sort(rosterAsArray,new PersonAgeComparator());
    }
    public void searchByLambda(List<Person> personList){
        Person[] rosterAsArray = personList.toArray(new Person[personList.size()]);
        Arrays.sort(rosterAsArray,(a,b)->{return a.getBirthday().compareTo(b.getBirthday());});
    }
    public void searchByLambda2(List<Person> personList){
        Person[] rosterAsArray = personList.toArray(new Person[personList.size()]);
        Arrays.sort(rosterAsArray,(a,b)->Person.compareByAge(a,b));
    }
   public void searchByLambda3(List<Person> personList){
        Person[] rosterAsArray = personList.toArray(new Person[personList.size()]);
        Arrays.sort(rosterAsArray,Person::compareByAge);
    }

    public static void main(String[] args){
     SearchPerson searchPerson = new SearchPerson();
        Filter temp =(p) -> {
            return p.getGender() == Person.Sex.MALE
                    && p.getAge() >= 18
                    && p.getAge() <= 25;
        };
        Person obj= new Person();
        obj.setGender(Person.Sex.FEMALE);
        obj.setAge(18);
        System.out.println(searchPerson.findPeople(obj,temp));
    }


}
