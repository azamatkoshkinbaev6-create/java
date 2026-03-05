import java.util.Random;
public class massiv17 {
        public static void main(String[] args) {
            String[] words = {"java", "code", "matrix", "array", "hello"};
            Random rand = new Random();

            String s1 = words[rand.nextInt(words.length)];
            String s2 = words[rand.nextInt(words.length)];
            String s3 = words[rand.nextInt(words.length)];
            String s4 = words[rand.nextInt(words.length)];
            String s5 = words[rand.nextInt(words.length)];

            System.out.println(s1 + " " + s2 + " " + s3 + " " + s4 + " " + s5);

            if (s4.equals(s5))
                System.out.println("Нәтиже: " + s1 + s2);
            else
                System.out.println("Нәтиже: " + s1 + s3);
        }
    }

