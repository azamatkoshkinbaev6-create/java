import java.util.Random;
public class massiv4 {
        public static void main(String[] args) {
            Random rand = new Random();
            double[] C = new double[25];
            double kob = 1;
            boolean on = false;

            for (int i = 0; i < 25; i++) {
                C[i] = rand.nextDouble() * 20 - 10;
                System.out.printf("%.2f ", C[i]);
                if (C[i] > 0) {
                    kob *= C[i];
                    on = true;
                }
            }

            if (on) {
                System.out.println("\nОң элементтердің көбейтіндісі: " + kob);
            } else {
                System.out.println("\nОң элемент жоқ");
            }
        }
    }

