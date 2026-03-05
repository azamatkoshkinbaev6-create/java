import java.util.Random;
public class massiv2 {
        public static void main(String[] args) {
            Random rand = new Random();
            int[] B = new int[15];
            int sum = 0;

            for (int i = 0; i < 15; i++) {
                B[i] = rand.nextInt(51) - 25; // -25..25
                System.out.print(B[i] + " ");
                if (B[i] > 0) sum += B[i];
            }

            System.out.println("\nОң элементтердің қосындысы: " + sum);
        }
    }

