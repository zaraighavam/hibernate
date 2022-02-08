package java17.lambda;

import java.util.function.Consumer;

public class LambdaScope {
    class FirstLevel{
        public int i;
        public void calculate(int i){
            Consumer myconsumer= (y)->{
                System.out.println(i);
            };
            myconsumer.accept(i);
        }

        public int getI() {
            return i;
        }
    }
    public static void main(String[] args){
        LambdaScope lambdaScope=new LambdaScope();
        LambdaScope.FirstLevel f=lambdaScope.new FirstLevel();
        System.out.println(f.getI());
        f.calculate(5);
        System.out.println(f.getI());
    }
}
