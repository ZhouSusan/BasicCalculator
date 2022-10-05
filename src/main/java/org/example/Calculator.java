package org.example;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        try {
            Scanner scan = new Scanner(System.in);

            double a, b, result;
            char expression;

            System.out.println("Choose an operation: + (Addition), - (Subtraction), * (Multiplication), / (Division)");

            expression = scan.next().charAt(0);

            System.out.println("Enter you first number");
            a = scan.nextDouble();

            System.out.println("Enter you second number");
            b = scan.nextDouble();

            switch (expression) {
                case '+':
                    result = a + b;
                    String message1 = String.format("%s + %s = %s", a, b, result);
                    System.out.println(message1);
                    break;
                case '-':
                    result = a - b;
                    String message2 = String.format("%s - %s = %s", a, b, result);
                    System.out.println(message2);
                    break;
                case '/':
                    result = a / b;
                    String message3 = String.format("%s / %s = %s", a, b, result);
                    System.out.println(message3);
                    break;
                case '*':
                    result = a * b;
                    String message4 = String.format("%s * %s = %s", a, b, result);
                    System.out.println(message4);
                    break;
                default:
                    System.out.println("Please enter an valid operation.");
            }
            scan.close();
        } catch (Exception e) {
            System.out.println("Please enter an valid expression.");
        }
    }
}