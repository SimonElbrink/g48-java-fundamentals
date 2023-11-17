package se.lexicon;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        System.out.println("Enter first number");
        System.out.print("> ");
        double number1 = getDoubleFromUser();

        System.out.println("Select a operator, (+, -, *, /)");
        System.out.print("> ");
        String operator = getStringFromUser();

        System.out.println("Enter second number");
        System.out.print("> ");
        double number2 = getDoubleFromUser();


        switch (operator) {
            case "+":
                System.out.println(addition(number1, number2));
                break;
            case "-":
                System.out.println(subtraction(number1, number2));
                break;
            case "*":
                System.out.println(multiplication(number1, number2));
                break;
            case "/":
                System.out.println(division(number1, number2));
                break;
            default:
                System.out.println("No Operator Selected");
        }

    }

    public static String getStringFromUser(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public static double getDoubleFromUser(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextDouble();
    }


    public static double addition(double num1, double num2) {
        return num1 + num2;
    }

    public static double subtraction(double num1, double num2) {
        return num1 - num2;
    }

    public static double multiplication(double num1, double num2) {
        return num1 * num2;
    }

    public static double division(double num1, double num2) {
        return num1 / num2;
    }

}
