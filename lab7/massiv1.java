import java.util.Random;
public class massiv1 {
        public static void main(String[] args) {
            Random rand = new Random();
            int[] A = new int[20];
            int sum = 0;

            for (int i = 0; i < 20; i++) {
                A[i] = rand.nextInt(41) - 20; // -20..20
                System.out.print(A[i] + " ");
                if (A[i] < 0) sum += A[i];
            }

            System.out.println("\nТеріс элементтердің қосындысы: " + sum);
        }
    }
