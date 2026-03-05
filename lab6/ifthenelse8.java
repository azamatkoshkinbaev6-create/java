import java.util.Scanner;
public class ifthenelse8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("x енгіз: ");
        double x = sc.nextDouble();

        double f;

        if (x > -5 && x < 0) {
            f = Math.sqrt(Math.pow(x, 2) + Math.abs(x));
        } else if (x >= 0 && x < 2) {
            f = 5 * Math.pow(x, 3) + Math.cos(x);
        } else {
            f = 0;
            System.out.println("Анықталу облысына кірмейді");
        }

        System.out.println("F(x) = " + f);
    }
}