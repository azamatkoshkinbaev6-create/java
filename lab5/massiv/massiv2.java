package massiv;

public class massiv2 {
    public static void main(String[] args) {

        int[] arr = {5, 12, 3, 9, 20, 8};
        int count = 0;

        for (int x : arr) {
            if (x % 2 == 0) count++;
        }

        System.out.println("Жұп саны = " + count);
    }
}