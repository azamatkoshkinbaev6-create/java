import java.util.Scanner;
public class ifthenelse7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("x енгіз: ");
        double x = sc.nextDouble();

        double f;

        if (x > 0 && x < 1) {
            f = Math.sqrt(3 * (Math.pow(x,3)) + 4) + Math.cos(x);
        }
        else if (x >= 1) {
            f = 5 - Math.pow(Math.sin(9*x),2);
        }
        else {
            f = 0;
            System.out.println("Анықталу облысына кірмейді");
        }

        System.out.println("F(x) = " + f);
    }
}
