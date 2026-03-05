package continues;

public class continue2 {
    public static void main(String[] args) {

        for (int i = 1; i <= 100; i++) {

            String s = String.valueOf(i);

            if (s.contains("7")) {
                continue;
            }
            System.out.print(i + " ");
        }
    }
}
