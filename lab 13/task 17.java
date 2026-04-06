import java.util.*;

public class Tap_17 {
    public static void main(String[] args) {
        int sum=Arrays.asList(1,2,3,4)
                .stream()
                .reduce(0,Integer::sum);

        System.out.println(sum);
    }
}