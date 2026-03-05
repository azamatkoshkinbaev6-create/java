import java.util.Scanner;
public class ifthenelse9 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("x енгіз: ");
        double x = sc.nextDouble();

        double f;

        if (x >= 0 && x < 1) {
            f = x*Math.pow(Math.cos(x),2) + Math.sin(x);
        }
        else if (x >= 1 && x <= 2) {
            f = Math.cbrt(Math.pow(x,2) + 6*Math.sin(x));
        }
        else if (x > 2) {
            f = 1.7*Math.pow(x,3) + 7;
        }
        else {
            f = 0;
            System.out.println("Анықталу облысына кірмейді");
        }

        System.out.println("F(x) = " + f);
    }
}