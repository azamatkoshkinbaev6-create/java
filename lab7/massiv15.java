import java.util.Random;
public class massiv15 {
        public static void main(String[] args) {
            Random rand = new Random();
            int[][] A = new int[3][5];

            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 5; j++) {
                    A[i][j] = rand.nextInt(10);
                    System.out.print(A[i][j] + " ");
                }
                System.out.println();
            }
        }
    }

