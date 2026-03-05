package ekimassiv;

public class mass2 {

    public static void main(String[] args) {

        int[][] a = {
                {1,9,3},
                {7,2,6},
                {4,8,5}
        };

        for (int i = 0; i < a.length; i++) {
            int max = a[i][0];

            for (int j = 1; j < a[i].length; j++) {
                if (a[i][j] > max)
                    max = a[i][j];
            }

            System.out.println("Жол " + i + " max = " + max);
        }
    }
}
