import java.util.Scanner;
public class ifthenelse11 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("x енгіз: ");
        double x = sc.nextDouble();

        double f;

        if (x > 0 && x <= 4) {
            f = Math.sin(Math.PI*x) + Math.pow(Math.pow(x,2) + 6, 1.0/5.0);
        }
        else if (x > 4) {
            f = Math.log(x) + Math.sqrt(3*x + 7);
        }
        else {
            f = 0;
            System.out.println("Анықталу облысына кірмейді");
        }

        System.out.println("F(x) = " + f);
    }
}
