import java.util.function.Consumer;

public class Tap_11 {
    public static void main(String[] args) {
        Consumer<String> print=s->System.out.println(s);
        print.accept("Hello");
    }
}