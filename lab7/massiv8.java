import java.util.Random;
public class massiv8 {
        public static void main(String[] args) {
            Random rand = new Random();
            double[][] A = new double[12][6];

            for (int i = 0; i < 12; i++) {
                for (int j = 0; j < 6; j++) {
                    A[i][j] = rand.nextDouble() * 20 - 10;
                    System.out.printf("%.2f\t", A[i][j]);
                }
                System.out.println();
            }

            for (int j = 0; j < 6; j++) {
                double kob = 1;
                boolean teris = false;

                for (int i = 0; i < 12; i++) {
                    if (A[i][j] < 0) {
                        kob *= A[i][j];
                        teris = true;
                    }
                }

                if (teris) {
                    System.out.println("Баған " + j + ": " + kob);
                } else {
                    System.out.println("Баған " + j + ": Теріс жоқ");
                }
            }
        }
    }

