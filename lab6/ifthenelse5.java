import java.util.Scanner;
public class ifthenelse5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("x енгіз: ");
        double x = sc.nextDouble();

        double f;

        if (x > 0 && x < 2) {
            f = Math.pow(x,3) * Math.cos(x);
        }
        else if (x >= 2 && x <= 5) {
            f = 3*Math.pow(x,4) + 7;
        }
        else if (x > 5 && x <= 9) {
            f = Math.sqrt(5*Math.pow(x,2) + 1.6);
        }
        else {
            f = 0;
            System.out.println("Анықталу облысына кірмейді");
        }

        System.out.println("F(x) = " + f);
    }
}
