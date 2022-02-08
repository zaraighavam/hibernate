package java17.lambda;

public class TargetTypeExample {
    public interface Runnable{
        public void run();
    }
    public interface Callback<T>{
       public  T run();
    }
    void invoke(Runnable r) {
        r.run();
    }

    <T> T invoke(Callback<T> c) {
        return c.run();
    }
    public static void main(String[] args){
        TargetTypeExample targetTypeExample=new TargetTypeExample();
        targetTypeExample.invoke(()->"done");
    }

}
