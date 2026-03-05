import java.util.Random;
public class massiv10 {
        public static void main(String[] args) {
            Random rand = new Random();
            double[][] D = new double[7][7];
            double sum = 0;

            for (int i = 0; i < 7; i++) {
                for (int j = 0; j < 7; j++) {
                    D[i][j] = rand.nextDouble() * 20;
                    System.out.printf("%.2f\t", D[i][j]);
                }
                System.out.println();
            }

            for (int i = 0; i < 7; i++) sum += D[i][i];

            System.out.println("Орта мән: " + sum / 7);
        }
    }

