import java.util.Random;
public class massiv5 {
        public static void main(String[] args) {
            Random rand = new Random();
            double[] D = new double[17];
            double sum = 0;

            for (int i = 0; i < 17; i++) {
                D[i] = rand.nextDouble() * 50;
                System.out.printf("%.2f ", D[i]);
                sum += D[i];
            }

            System.out.println("\nОрташа мән: " + sum / 17);
        }
    }

