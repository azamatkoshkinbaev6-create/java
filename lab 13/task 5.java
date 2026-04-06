import java.util.*;

public class Tap_5 {
    public static void main(String[] args) {
        int max=Arrays.asList(5,9,2)
                .stream()
                .max(Integer::compare)
                .orElse(0);

        System.out.println(max);
    }
}