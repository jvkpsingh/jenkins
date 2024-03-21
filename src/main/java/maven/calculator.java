import java.util.Scanner;

public class calculator {
   public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double num1, num2, result;
        char operator;

        System.out.print("Enter the first number for add minus and subtract: ");
        num1 = input.nextDouble();

        System.out.print("Enter and choose the mention operator operator (+, -, *, /): ");
        operator = input.next().charAt(0);

        System.out.print("Enter the second number for add minus multiply: ");
        num2 = input.nextDouble();

        if (operator == '+') {
            result = num1 + num2;
        } else if (operator == '-') {
            result = num1 - num2;
        } else if (operator == '*') {
            result = num1 * num2;
        } else if (operator == '/') {
            if (num2 != 0) {
                result = num1 / num2;
            } else {
                System.out.println("Error: Division by zeroo is not allowed.");
                return;
            }
        } else {
            System.out.println("Error: this is  the Invalid operator.");
            return;
        }

        System.out.println("Result: " + result);
    }
}

