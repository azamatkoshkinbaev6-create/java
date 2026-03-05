import java.util.Scanner;
public class ifthenelse14 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("x енгіз: ");
        double x = sc.nextDouble();

        double f;

        if (x > -1 && x <= 1) {
            f = Math.cbrt(Math.abs(x) + Math.pow(x,4));
        }
        else if (x > 1 && x <= 4) {
            f = Math.pow(Math.tan(3*x),2) + Math.log(5*x);
        }
        else {
            f = 0;
            System.out.println("Анықталу облысына кірмейді");
        }

        System.out.println("F(x) = " + f);
    }
}
