package se.lexicon.mini_calc_app;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        while(true){
            System.out.println("##############################################");
            System.out.println("   Hi👋, welcome to a simple calculator 🧮");
            System.out.println("###################  Menu  ###################");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");
            System.out.println("##############################################");
            System.out.println("Select an option:");
            System.out.print("> ");
            String operator = getStringFromUser();

            if (operator.equals("5")) {
                System.out.println("Thanks for using this calculator. 😎");
                break;
            }

            System.out.println("Enter first number");
            System.out.print("> ");
            double number1 = getDoubleFromUser();

            System.out.println("Enter second number");
            System.out.print("> ");
            double number2 = getDoubleFromUser();


            switch (operator) {
                case "1":
                    System.out.println("Result: " + addition(number1, number2));
                    break;
                case "2":
                    System.out.println("Result: " + subtraction(number1, number2));
                    break;
                case "3":
                    System.out.println("Result: " + multiplication(number1, number2));
                    break;
                case "4":
                    System.out.println("Result: " + division(number1, number2));
                    break;
                default:
                    System.out.println("No Operator Selected");
            }
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
