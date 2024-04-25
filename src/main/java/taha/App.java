package taha;

import java.util.Scanner;

public class App {
    private static final Scanner scanner = new Scanner(System.in);
    private static final Calculator calculator = new Calculator();

    public static void main(String[] args) {
        int num1 = readNumber("Enter the first number: ");
        int num2 = readNumber("Enter the second number: ");
        int choice = chooseOperation();

        performOperation(num1, num2, choice);

        scanner.close();
    }

    private static int readNumber(String message) {
        System.out.print(message);
        return scanner.nextInt();
    }

    private static int chooseOperation() {
        System.out.println("Choose operation:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");

        return scanner.nextInt();
    }

    private static void performOperation(int num1, int num2, int choice) {
        switch (choice) {
            case 1:
                System.out.println("Result of Addition: " + calculator.add(num1, num2));
                break;
            case 2:
                System.out.println("Result of Subtraction: " + calculator.subtract(num1, num2));
                break;
            case 3:
                System.out.println("Result of Multiplication: " + calculator.multiply(num1, num2));
                break;
            case 4:
                try {
                    System.out.println("Result of Division: " + calculator.divide(num1, num2));
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                }
                break;
            default:
                System.out.println("Invalid choice");
        }
    }
}
