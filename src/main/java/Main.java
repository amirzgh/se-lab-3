import calculator.Calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to cip calculator");
        System.out.println("please Enter your first number");
        int number1 = scanner.nextInt();
        System.out.println("please Enter your second number");
        int number2 = scanner.nextInt();
        System.out.println("Chose and type you operator: * ^ / +");
        String operator = scanner.nextLine();

        Calculator calculator = new Calculator();

        int result = calculator.calculate(number2, number2, operator.charAt(0));

        System.out.println("your Result is : " + result);
    }
}
