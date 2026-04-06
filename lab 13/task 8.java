import java.util.*;

public class Tap_8 {
    public static void main(String[] args) {
        Arrays.asList("java","programming","code")
                .stream()
                .filter(s->s.length()>5)
                .forEach(System.out::println);
    }
}