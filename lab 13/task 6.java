import java.util.*;

public class Tap_6 {
    public static void main(String[] args) {
        List<String> list=Arrays.asList("java","hi","stream");

        list.stream()
                .sorted(Comparator.comparing(String::length))
                .forEach(System.out::println);
    }
}