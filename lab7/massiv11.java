import java.util.Random;
public class massiv11 {
        public static void main(String[] args) {
            Random rand = new Random();
            int[] A = new int[25];

            for (int i = 0; i < 25; i++) {
                A[i] = rand.nextInt(100);
                System.out.print(A[i] + " ");
            }

            int max = 0, min = 0;
            for (int i = 1; i < 25; i++) {
                if (A[i] > A[max]) max = i;
                if (A[i] < A[min]) min = i;
            }

            int temp = A[max];
            A[max] = A[min];
            A[min] = temp;


            System.out.println("\nАуыстырылған массив:");
            for (int i = 0; i < A.length; i++) {
                System.out.print(A[i] + " ");
            }
        }
    }

