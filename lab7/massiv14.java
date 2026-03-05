import java.util.Random;
public class massiv14 {
        public static void main(String[] args) {
            Random rand = new Random();
            int[] D = new int[30];
            int zhup = 0, taq = 0;

            for (int i = 0; i < 30; i++) {
                D[i] = rand.nextInt(100);
                System.out.print(D[i] + " ");
                if (D[i] % 2 == 0) zhup += D[i];
                else taq += D[i];
            }

            System.out.println("\nЖұп: " + zhup);
            System.out.println("Тақ: " + taq);
        }
    }

