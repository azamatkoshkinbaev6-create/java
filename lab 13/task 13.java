import java.util.*;

public class Tap_13 {
    public static void main(String[] args) {
        List<String> list=Arrays.asList("bbb","a","cc");

        list.stream()
                .sorted(Comparator.comparing(String::length))
                .forEach(System.out::println);
    }
}