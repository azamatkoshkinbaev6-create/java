package ifelse;

import java.util.Scanner;
public class shartty2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Санды енгізіңіз: ");
        int n = sc.nextInt();
        if(n % 3 == 0 && n % 5 == 0) {
            System.out.println("3-ке де, 5-ке де бөлінеді");
        } else {
            System.out.println("Бөлінбейді");
        }
    }
}