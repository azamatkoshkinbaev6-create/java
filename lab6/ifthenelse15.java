import java.util.Scanner;
public class ifthenelse15 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("x енгіз: ");
        double x = sc.nextDouble();

        double f;

        if (x > 1 && x <= 3) {
            f = Math.pow(Math.pow(x,3) + Math.sin(Math.PI*x), 0.25) + Math.log(x);
        }
        else if (x > 3 && x <= 7) {
            f = (Math.cbrt(1.5*Math.pow(x,2) - Math.exp(2*x)) + Math.pow(Math.log(x),3));
        }
        else {
            f = 0;
            System.out.println("Анықталу облысына кірмейді");
        }

        System.out.println("F(x) = " + f);
    }
}
