package ifelse;

import java.util.Scanner;
public class shartty1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Санды енгізіңіз: ");
        int n = sc.nextInt();
        if(n > 0) {
            System.out.println("Оң сан");
        } else if (n < 0) {
            System.out.println("Теріс сан");
        } else {
            System.out.println("Нөл");

        }
    }
}