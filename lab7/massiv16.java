import java.util.Random;
public class massiv16 {
    public static int maxX(int[][] A) {
        int max = A[0][0];
        for (int i = 0; i < A.length; i++) {          // қатар бойынша
            for (int j = 0; j < A[i].length; j++) {  // баған бойынша
                if (A[i][j] > max) {
                    max = A[i][j];
                }
            }
        }
        return max;
    }

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

            System.out.println("Max: " + maxX(A));
        }
    }

