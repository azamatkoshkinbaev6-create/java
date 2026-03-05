import java.util.Random;
public class massiv3 {
        public static void main(String[] args) {
            Random rand = new Random();
            double[] A = new double[12];
            double kob = 1;
            boolean teris = false;

            for (int i = 0; i < 12; i++) {
                A[i] = rand.nextDouble() * 20 - 10; // -10..10
                System.out.printf("%.2f ", A[i]);
                if (A[i] < 0) {
                    kob *= A[i];
                    teris = true;
                }
            }

            if (teris) {
                System.out.println("\nТеріс элементтердің көбейтіндісі: " + kob);
            } else {
                System.out.println("\nТеріс элемент жоқ");
            }
        }
    }

