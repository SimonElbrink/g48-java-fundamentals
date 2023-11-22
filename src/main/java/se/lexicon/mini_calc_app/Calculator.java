package se.lexicon.mini_calc_app;

import static se.lexicon.mini_calc_app.ScannerUtil.getStringFromUser;
import static se.lexicon.mini_calc_app.ScannerUtil.getDoubleFromUser;


public class Calculator {
    public static void run() {
        welcomeMessage();

        while(true){
            printMenu();

            promptMessage("Select an option:");
            String operator = getStringFromUser();

            if (operator.equals("5")) {
                System.out.println("Thanks for using this calculator. 😎");
                break; //End while loop
            };

            promptMessage("Enter first number");
            double number1 = getDoubleFromUser();

            promptMessage("Enter second number");
            double number2 = getDoubleFromUser();

            evaluateCalculation(operator, number1, number2);


        }
    }

    //Access Modifier - Private - Methods can only be accessed in this class (Calculator)
    private static void welcomeMessage() {
        System.out.println("##############################################");
        System.out.println("   Hi👋, welcome to a simple calculator 🧮");
    }

    private static void printMenu() {
        System.out.println("###################  Menu  ###################");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Exit");
        System.out.println("##############################################");
    }

    private static void promptMessage(String prompt){
        System.out.println(prompt);
        System.out.print("> ");
    }

    private static void evaluateCalculation(String operator, double number1, double number2) {
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

    //Access Modifier - Default/Package - Can be accessed only from inside the same package (se.lexicon.mini_calc_app)
    static double addition(double num1, double num2) {
        return num1 + num2;
    }

    static double subtraction(double num1, double num2) {
        return num1 - num2;
    }

    static double multiplication(double num1, double num2) {
        return num1 * num2;
    }

    static double division(double num1, double num2) {
        return num1 / num2;
    }

}
