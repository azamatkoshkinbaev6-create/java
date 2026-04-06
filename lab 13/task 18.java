import java.util.*;

public class Tap_18 {
    public static void main(String[] args) {
        Arrays.asList(1,1,2,2,3,4,5)
                .stream()
                .distinct()
                .limit(3)
                .forEach(System.out::println);
    }
}