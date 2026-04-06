import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
public class calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> history = new ArrayList<>(); // Тапсырма 6: Тарихты сақтау
        boolean continueCalc = true;

        while (continueCalc) {
            try {
                // Тапсырма 7: Экранды тазалау имитациясы
                System.out.println("\n".repeat(5));

                // Тапсырма 5: Сандар арқылы таңдалатын меню
                System.out.println("--- Калькулятор Мәзірі ---");
                System.out.println("1 - Қосу (+)");
                System.out.println("2 - Азайту (-)");
                System.out.println("3 - Көбейту (*)");
                System.out.println("4 - Бөлу (/)");
                System.out.println("5 - Дәрежеге шығару (x^y)"); // Тапсырма 1
                System.out.println("6 - Квадрат түбір (√)");      // Тапсырма 2
                System.out.println("7 - Пайыз есептеу (%)");     // Тапсырма 8
                System.out.println("8 - Инженерлік (sin/cos/tan)"); // Тапсырма 9
                System.out.println("9 - Тарихты көру");
                System.out.println("0 - Шығу");
                System.out.print("Таңдауыңыз: ");

                int choice = scanner.nextInt();

                if (choice == 0) break;
                if (choice == 9) {
                    System.out.println("--- Есептеулер тарихы ---");
                    for (String item : history) System.out.println(item);
                    continue;
                }

                double res = 0;
                String operationStr = "";

                // Тапсырма 2 және 9 үшін бір сан жеткілікті
                if (choice == 6 || choice == 8) {
                    System.out.print("Санды енгізіңіз: ");
                    double n = scanner.nextDouble();

                    if (choice == 6) {
                        res = Math.sqrt(n);
                        operationStr = "√" + n + " = " + res;
                    } else {
                        System.out.print("Функцияны таңдаңыз (1-sin, 2-cos, 3-tan): ");
                        int func = scanner.nextInt();
                        double rad = Math.toRadians(n); // Градусты радианға айналдыру
                        if (func == 1) { res = Math.sin(rad); operationStr = "sin(" + n + "°) = " + res; }
                        else if (func == 2) { res = Math.cos(rad); operationStr = "cos(" + n + "°) = " + res; }
                        else { res = Math.tan(rad); operationStr = "tan(" + n + "°) = " + res; }
                    }
                } else {
                    // Екі санды қажет ететін операциялар (Тапсырма 3: теріс сандарды да қабылдайды)
                    System.out.print("Бірінші санды енгізіңіз: ");
                    double n1 = scanner.nextDouble();
                    System.out.print("Екінші санды енгізіңіз: ");
                    double n2 = scanner.nextDouble();

                    switch (choice) {
                        case 1: res = n1 + n2; operationStr = n1 + " + " + n2 + " = " + res; break;
                        case 2: res = n1 - n2; operationStr = n1 + " - " + n2 + " = " + res; break;
                        case 3: res = n1 * n2; operationStr = n1 + " * " + n2 + " = " + res; break;
                        case 4:
                            if (n2 == 0) throw new ArithmeticException("Нөлге бөлуге болмайды!");
                            res = n1 / n2; operationStr = n1 + " / " + n2 + " = " + res; break;
                        case 5: res = Math.pow(n1, n2); operationStr = n1 + "^" + n2 + " = " + res; break;
                        case 7: res = (n1 * n2) / 100; operationStr = n1 + " санынның " + n2 + "% = " + res; break;
                        default: System.out.println("Қате таңдау!"); continue;
                    }
                }

                System.out.println("Нәтиже: " + res);
                history.add(operationStr);

            } catch (InputMismatchException e) { // Тапсырма 4: Қате мәліметті өңдеу
                System.out.println("Қате: Тек сан енгізіңіз!");
                scanner.next(); // Сканнерді тазалау
            } catch (Exception e) {
                System.out.println("Қате: " + e.getMessage());
            }
        }
    }
}