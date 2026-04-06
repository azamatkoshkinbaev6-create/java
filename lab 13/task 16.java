import java.util.*;
import java.util.stream.Collectors;

public class Tap_16 {
    public static void main(String[] args) {
        List<String> list=Arrays.asList("java","js","python");

        Map<Integer,List<String>> group=
                list.stream()
                        .collect(Collectors.groupingBy(String::length));

        System.out.println(group);
    }
}