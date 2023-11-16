package se.lexicon;

public class OperatorExamples {
    public static void main(String[] args) {
        int number1;
        number1 = 10;

        int number2 = 5;

        number1 = number2; // number1 = 5
        System.out.println(number1);

        int result = 42 + 10;
        System.out.println(result); //52

        System.out.println(number1 + number2); //10

        System.out.println(10 * 5); // 50
        System.out.println(10 / 2); // 5


        int counter = 10;

        counter++; // counter = counter + 1

        System.out.println("counter = " + counter);

        int n1 = 10;
        int n2 = 5;

        int result1 = n1 / n2;

        boolean result10 = n1 < n2;

        System.out.println("result10 = " + result10);

    }

    public static void incrementByOne(){

        int number10 = 10;
        System.out.println(number10++); // 1.print 10 , 2.increment by 1

        int number20 = 20;
        System.out.println(++number20); //1. increment by 1 , 2.Print 21

    }
}
