package switchcase;

import java.util.Scanner;

public class switch2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Бірінші сан: ");
        double a = sc.nextDouble();

        System.out.println("Амал(+ - * /): ");
        char op = sc.next().charAt(0);

        System.out.println("Екінші сан: ");
        double b = sc.nextDouble();

        switch(op) {
            case '+': System.out.println(a + b); break;
            case '-': System.out.println(a - b); break;
            case '*': System.out.println(a * b); break;
            case '/': System.out.println(a / b); break;
            default: System.out.println("Қате амал!");

        }
    }
}