package dowhile;

import java.util.Scanner;
public class do2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("1 - Сәлем шығару");
            System.out.println("2 - Қосу");
            System.out.println("3 - Шығу");
            choice = sc.nextInt();

            switch(choice) {
                case 1: System.out.println("Сәлем!"); break;
                case 2: System.out.println("2 + 2 = 4"); break;
            }

        } while (choice != 3);
    }
}
