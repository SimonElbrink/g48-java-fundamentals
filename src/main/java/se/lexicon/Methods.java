package se.lexicon;

public class Methods {
    public static void main(String[] args) {

        double number1 = 10.50;
        double number2 = 50.60;
        System.out.println(addition(number1, number2));

        System.out.println(addition(100.60, 350.90));
        //System.out.println(number1 + number2);

        greetings("G48");
        greetings("Mehrdad");


    }

    static double addition(double num1, double num2){
        double result = num1 + num2;
        return result;
    }

    static void greetings(String groupName){
        System.out.println("Greeting: " + groupName);
    }

}
