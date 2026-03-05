import java.util.Random;
import java.util.Arrays;
public class massiv12 {

        public static void main(String[] args) {
            Random rand = new Random();
            int[] B = new int[25];

            for (int i = 0; i < 25; i++) {
                B[i] = rand.nextInt(100);
                System.out.print(B[i] + " ");
            }

            Arrays.sort(B);


            System.out.println("\nСұрыпталған:");
            for (int i = 0; i < B.length; i++) {
                System.out.print(B[i] + " ");
            }
        }
    }

