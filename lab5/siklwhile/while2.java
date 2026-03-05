package siklwhile;

import java.util.Scanner;
public class while2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("N енгізіңіз: ");
        int n = sc.nextInt();

        long fact = 1;
        int i = 1;

        while (i <= n) {
            fact *= i;
            i++;
        }

        System.out.println("Факториал = " + fact);
    }
}
