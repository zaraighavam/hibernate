package java17.reflection;


import java.lang.annotation.Annotation;
import java.lang.reflect.Modifier;
import java.lang.reflect.TypeVariable;
import java.util.Arrays;

public class MethodReflection {
    public static void main(String[] args){
        try {
            Class test = Class.forName(args[0]);
            System.out.println(test.getCanonicalName());
            System.out.println(Modifier.toString(test.getModifiers()));
            TypeVariable[] typeParameters = test.getTypeParameters();
            Arrays.stream(typeParameters).forEach(t -> System.out.println(t.getName()));
            Arrays.stream(test.getGenericInterfaces()).forEach(t->System.out.println(t.getTypeName()));
            Arrays.stream(test.getAnnotations()).filter(t->t.annotationType().getName()=="Immutable").map(Annotation::annotationType);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
