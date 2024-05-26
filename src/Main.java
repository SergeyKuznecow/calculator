import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Input:");
        Scanner scanner = new Scanner(System.in);
        try {
            String input = scanner.nextLine();
            String[] symbols = input.split(" ");
            if (symbols.length != 3) {
                throw new IllegalArgumentException("throws Exception // вводите числа и символ операции через пробел и не более 2-х.");
            }
            int a = Integer.parseInt(symbols[0]);
            int b = Integer.parseInt(symbols[2]);
            if (a > 10 || b > 10 ) {
                throw new IllegalArgumentException("По условию задачи вводите числа не более 10.");
            }
            int result = switch (symbols[1]) {
                case "+" -> a + b;
                case "-" -> a - b;
                case "*" -> a * b;
                case "/" -> {
                    if (b == 0) {
                        throw new ArithmeticException("Деление на 0 недопустимо!");
                    }
                    yield a / b;
                }
                default ->
                        throw new IllegalArgumentException("Недопустимая операция. Выбирайте следующие символы: +, -, *, /");
            };
            System.out.println("Output:");
            System.out.println(result);

        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());




        }
    }
}
