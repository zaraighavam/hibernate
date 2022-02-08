package java17.lambda;

import java.util.Set;
import java.util.function.BiFunction;

public class MethodReferencesExamples {

    public static <T> T mergeThings(T a, T b, BiFunction<T, T, T> merger) {
        return merger.apply(a, b);
    }
    public static String appendStrings(String a, String b) {
        return a + b;
    }
    public static void creatHasSet(Set<? extends Object> obj){

    }

    public String appendStrings2(String a, String b) {
        return a + b;
    }

    public static void main(String[] args){
        MethodReferencesExamples m = new MethodReferencesExamples();
        System.out.println(MethodReferencesExamples.mergeThings("Hello" ,"world",(a,b)->a+b));
        System.out.println(MethodReferencesExamples.mergeThings("Hello" ,"world",MethodReferencesExamples::appendStrings));
        System.out.println(MethodReferencesExamples.mergeThings("Hello" ,"world",m::appendStrings2));
        System.out.println(MethodReferencesExamples.mergeThings("Hello" ,"world",String::concat));

    }
}
