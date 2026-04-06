import java.util.*;

public class Tap_19 {
    public static void main(String[] args) {
        List<List<Integer>> lists=Arrays.asList(
                Arrays.asList(1,2),
                Arrays.asList(3,4)
        );

        lists.stream()
                .flatMap(List::stream)
                .forEach(System.out::println);
    }
}