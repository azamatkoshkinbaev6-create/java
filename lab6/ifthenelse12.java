import java.util.Scanner;
public class ifthenelse12 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("x енгіз: ");
        double x = sc.nextDouble();

        double f;

        if (x > 0 && x <= 2) {
            f = Math.cbrt(1.7*x + Math.sin(x));
        }
        else if (x > 2 && x <= 6) {
            f = Math.cos(Math.PI*x) + Math.tan(x);
        }
        else {
            f = 0;
            System.out.println("Анықталу облысына кірмейді");
        }

        System.out.println("F(x) = " + f);
    }
}
