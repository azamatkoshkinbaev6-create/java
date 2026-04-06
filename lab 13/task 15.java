import java.util.*;

public class Tap_15 {
    public static void main(String[] args) {
        Arrays.asList(1,2,3,4,5)
                .stream()
                .filter(x->x>2)
                .map(x->x*2)
                .sorted()
                .forEach(System.out::println);
    }
}