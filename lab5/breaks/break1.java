package breaks;

public class break1 {
    public static void main(String[] args) {

        for (int i = 1; i <= 100; i++) {
            if (i % 13 == 0) break;
            System.out.print(i + " ");
        }
    }
}
