import java.util.function.Function;

public class Tap_2 {
    public static void main(String[] args) {
        Function<String,String> upper=s->s.toUpperCase();
        System.out.println(upper.apply("java"));
    }
}