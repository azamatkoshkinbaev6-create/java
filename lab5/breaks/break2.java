package breaks;

public class break2 {
    public static void main(String[] args) {

        for (int i = 1; i <= 200; i++) {

            if (i % 7 == 0 && i % 9 == 0) {
                System.out.println("Ізделінген сан: " + i);
                break;
            }
        }
    }
}