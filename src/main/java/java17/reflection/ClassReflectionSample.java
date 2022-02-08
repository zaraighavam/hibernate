package java17.reflection;

import java17.lambda.search.Person;

public class ClassReflectionSample {
    public static void main(String[] args){
        try {
            Class c = "foo".getClass();
            Class b = String.class;
            Class a = Class.forName("java.lang.String");
            Class<? super Person> superclass = Person.class.getSuperclass();
            Class<?>[] classes = Person.class.getClasses();
            Class<?>[] classes1 = Person.class.getDeclaredClasses();
            Class<?> enclosingClass = Person.class.getEnclosingClass();

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
