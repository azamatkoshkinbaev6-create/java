import java.util.*;
public class tap10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Өрнекті енгізіңіз (мысалы: 2 + 3 * 4):");
        String input = scanner.nextLine();

        try {
            double result = evaluate(input);
            System.out.println("Нәтиже: " + result);
        } catch (Exception e) {
            System.out.println("Қате: Өрнек форматы дұрыс емес. Бос орындарды ұмытпаңыз.");
        }
    }

    public static double evaluate(String expression) {
        // Жолды бос орындар арқылы бөліктерге бөлеміз
        String[] tokens = expression.split(" ");

        Stack<Double> values = new Stack<>();
        Stack<Character> ops = new Stack<>();

        for (int i = 0; i < tokens.length; i++) {
            String token = tokens[i];

            if (token.isEmpty()) continue;

            // Егер бұл сан болса, стекке саламыз
            if (Character.isDigit(token.charAt(0)) || (token.length() > 1 && token.charAt(0) == '-')) {
                values.push(Double.parseDouble(token));
            }
            // Егер бұл таңба болса
            else if (token.length() == 1) {
                char op = token.charAt(0);
                // Приоритетті ескере отырып есептеу (* және / бірінші)
                while (!ops.isEmpty() && hasPrecedence(op, ops.peek())) {
                    values.push(applyOp(ops.pop(), values.pop(), values.pop()));
                }
                ops.push(op);
            }
        }

        // Қалған операцияларды орындау
        while (!ops.isEmpty()) {
            values.push(applyOp(ops.pop(), values.pop(), values.pop()));
        }

        return values.pop();
    }

    // Операциялардың басымдылығын анықтау (Precedence)
    public static boolean hasPrecedence(char op1, char op2) {
        if ((op1 == '*' || op1 == '/') && (op2 == '+' || op2 == '-')) {
            return false;
        }
        return true;
    }

    // Арифметикалық амалды орындау
    public static double applyOp(char op, double b, double a) {
        switch (op) {
            case '+': return a + b;
            case '-': return a - b;
            case '*': return a * b;
            case '/':
                if (b == 0) throw new ArithmeticException("Нөлге бөлуге болмайды");
                return a / b;
        }
        return 0;
    }
}
