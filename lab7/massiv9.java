import java.util.Random;
public class massiv9 {

        public static void main(String[] args) {
            Random rand = new Random();
            int[][] C = new int[5][5];
            int kob = 1;
            boolean on = false;

            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 5; j++) {
                    C[i][j] = rand.nextInt(21) - 10;
                    System.out.print(C[i][j] + "\t");
                }
                System.out.println();
            }

            for (int i = 0; i < 5; i++) {
                if (C[i][i] > 0) {
                    kob *= C[i][i];
                    on = true;
                }
            }

            if (on) {
                System.out.println("Көбейтінді: " + kob);
            } else {
                System.out.println("Оң элемент жоқ");
            }
        }
    }

