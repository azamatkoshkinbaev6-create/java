import java.util.Random;
public class massiv13 {
        public static void main(String[] args) {
            Random rand = new Random();
            int[] C = new int[20];
            int sum = 0;

            for (int i = 0; i < 20; i++) {
                C[i] = rand.nextInt(100);
                System.out.print(C[i] + " ");
                sum += C[i];
            }

            System.out.println("\nОрташа мән: " + (double) sum / 20);
        }
    }
