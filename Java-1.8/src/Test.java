import java.util.function.Function;

public class Test {
    public static void main(String[] args){

        Function<Integer,Integer> square = i ->  i*i ;
        System.out.println("square = "+square.apply(10));
    }
}
