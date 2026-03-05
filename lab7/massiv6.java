import java.util.Random;
public class massiv6 {
        public static void main(String[] args) {
            Random rand = new Random();
            int[][] A = new int[10][10];
            int[] B = new int[10];

            for (int i = 0; i < 10; i++) {
                int sum = 0;
                for (int j = 0; j < 10; j++) {
                    A[i][j] = rand.nextInt(41) - 20;
                    System.out.print(A[i][j] + "\t");
                    if (A[i][j] < 0) sum += A[i][j];
                }
                B[i] = sum;
                System.out.println();
            }

            System.out.println("B массиві:");
            for (int i = 0; i < B.length; i++) {
                System.out.print(B[i] + " ");
            }
        }
    }

