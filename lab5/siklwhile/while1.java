package siklwhile;

import java.util.Scanner;
public class while1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;

        while (n <= 0) {
            System.out.print("Оң сан енгізіңіз: ");
            n = sc.nextInt();

            if (n <= 0) {
                System.out.println("Қате! Оң сан енгізу керек.");
            }
        }

        System.out.println("Сіз " + n + " оң санын енгіздіңіз.");
    }
}
