import java.util.Random;
public class massiv7 {
        public static void main(String[] args) {
            Random rand = new Random();
            double[][] B = new double[5][5];
            double[] A = new double[5];

            for (int i = 0; i < 5; i++) {
                double sum = 0;
                for (int j = 0; j < 5; j++) {
                    B[i][j] = rand.nextDouble() * 20 - 10;
                    System.out.printf("%.2f\t", B[i][j]);
                    if (B[i][j] > 0) sum += B[i][j];
                }
                A[i] = sum;
                System.out.println();
            }

            System.out.println("A массиві:");
            for (int i = 0; i < A.length; i++) {
                System.out.print(A[i] + " ");
            }
        }
    }

