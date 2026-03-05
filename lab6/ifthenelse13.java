import java.util.Scanner;
public class ifthenelse13 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("x енгіз: ");
        double x = sc.nextDouble();

        double f;

        if (x > 1 && x <= 3) {
            f = Math.sin(5*x)*(Math.sqrt(1+Math.pow(x,2)) + Math.pow(Math.log(x),2));
        }
        else if (x > 3 && x <= 5) {
            f = Math.exp(x)*Math.cbrt(x + Math.exp(2*x));
        }
        else {
            f = 0;
            System.out.println("Анықталу облысына кірмейді");
        }

        System.out.println("F(x) = " + f);
    }
}