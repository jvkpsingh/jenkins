import java.util.Scanner;

public class calculator {
   public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double num1, num2, result;
        char operator;

        System.out.print("Enter the first number-1 for adddd minus and subtract and divide: ");
        num1 = input.nextDouble();

        System.out.print("Enter the and choose the mention operator and operator is (+, -, *, /): ");
        operator = input.next().charAt(0);

        System.out.print("Enter the second of  number for add minus multiply: ");
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
                System.out.println("Error: Division by zero is not allowed.");
                return;
            }
        } else {
            System.out.println("Error: this is thge  the Invalid operator.");
            return;
        }

        System.out.println("Result: " + result);
    }
} 

