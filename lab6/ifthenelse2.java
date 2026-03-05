import java.util.Scanner;
public class ifthenelse2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("x енгіз: ");
        double x = sc.nextDouble();

        double f;

        if (x >= 0) {
            f = Math.sqrt(Math.pow(x,3) + 5);
        }
        else if (x > -3 && x < 0) {
            f = 3 * Math.pow(x,4) + 9;
        }
        else {
            f = 0;
            System.out.println("Анықталу облысына кірмейді");
        }

        System.out.println("F(x) = " + f);
    }
}
