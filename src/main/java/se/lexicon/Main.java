package se.lexicon;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Hello World
//        System.out.println("Hello Group 48!");


        // DECLARE VARIABLES
        /*
        // DATATYPE name = VALUE;
        byte redColorCode = 127;
        byte greenColorCode = -128;
        byte blueColorCode = 0;

        short temperature = -300;
        short groupNumber = 48;

        int salary = 600000;

        long bigNumber = 600_000_000L;
        long bankBalance = 999999999999999999L;

        float PIE = 3.14f;
        float GRAVITY = 9.8F;

        boolean studentPresent = true;

        char a = 'a';
        char TestCharA = 'A';

        char hashtag = '\u0023';
        char omega = '\u03A9';

        System.out.println(redColorCode);
        System.out.println(studentPresent);
        System.out.println(omega);
        */

        // OPERATORS
        /*
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

        int number10 = 10;
        System.out.println(number10++); // 1.print 10 , 2.increment by 1


        int number20 = 20;
        System.out.println(++number20); //1. increment by 1 , 2.Print 21



        boolean result10 = number10 < number20;
        System.out.println("result10 = " + result10);

        */


        // SELECTION
        /*
        // 1. If grade is 65 or above = you passed
        // 2. if grade is 55 or above = your close but not passed
        // 3. else not passed

        int grade = 65;

        if(grade >= 65){
            System.out.println("You passed the Test!");
        } else if (grade >= 55){
            System.out.println("You almost passed the Test!");
        } else{
            System.out.println("You did not Pass The Test!");
        }

        // CEO, MANAGER, SUPPORT, TEACHER
        String employee = "MANAGER";

        switch (employee){
            case "CEO":
                System.out.println("Hello, here is the report about the company's Health");
                break;

            case "MANAGER":
                System.out.println("Hello and Welcome back, here is the Report you asked about Yesterday!");
                break;

            default:
                System.out.println("Hm.. Not Sure who you are but i guess.. Welcome?");
        }

        */


        // STRING
        /*
        // syntax -> ""
        // TYPE - String (Capital "S")

        String aWord = "Hi";
        String sentence = "Hello Java Group 48";
        String aName = "Simon";

        //1. Object starts with uppercase
        //2. Have methods

        System.out.println(sentence);
        System.out.println(sentence.toUpperCase());

        //String s = new String("String Value");

        //int i = 1000;
        //i. // No methods here

        */
        /*

        String firstName = "Simon";
        String lastName = "Elbrink";
        int birthYear = 1997;

        String personInformation = firstName + " " + lastName + " Age: " + (2023 - birthYear);

        System.out.println("personInformation = " + personInformation);

//        firstName.concat(" Robert");
//        firstName = firstName.concat(" Robert");

        System.out.println(firstName);

        System.out.println(firstName.concat(" Robert"));
        */

        // OBJECT
        /*
        Person simon = new Person();
        simon.firstName = "Simon";
        simon.lastName = "Elbrink";
        simon.birthYear = 1997;


        Person erik = new Person();
        erik.firstName = "Erik";
        erik.lastName = "Svensson";
        erik.birthYear = 1976;



//        String getSimonPersonInformation = simon.firstName + " " + simon.lastName + " Age: " + (2023 - simon.birthYear);
//        String getErikPersonInformation = erik.firstName + " " + erik.lastName + " Age: " + (2023 - erik.birthYear);
//        System.out.println(getSimonPersonInformation);

        System.out.println( simon.getPersonInformation() );
        System.out.println( erik.getPersonInformation() );

        */

        // METHODS
        /*
        double number1 = 10.50;
        double number2 = 50.60;

        System.out.println(addition(number1, number2));

        System.out.println(addition(100.60, 350.90));
        //System.out.println(number1 + number2);


        greetings("G48");
        greetings("Mehrdad");
        */


        // LOOPS

        //WHILE LOOP

        /**
         * A loop that continues to loop if your enter an age of 18 or above.
         * Loop is terminated if year is below 18.
         * loop is evaluated by an expression
         * Example. Age = 18 -> Loop Continues
         *          Age = 15 -> Loop ends
         */
        boolean isAdult = true;

        while (isAdult) {
            System.out.println("How old are you?");
            int age = scanner.nextInt();

            if (age >= 18) {
                System.out.println("You are an adult!");
            } else {
                System.out.println("You are a child!");
                isAdult = false;
            }
        }
        System.out.println("Done!");



        /**
         * Even if expression in while-loop is false
         *  Do-while loop runs at least one time.
         */
        int number = 5;
        do{
            number++;
        }
        while(number != 0 && number <5); // false

        System.out.println(number);


        /**
         * Do-while loop runs at least one time.
         */
        do {
            System.out.println("Just ones, no more.");
        }while(false);


        //FOR-LOOP
        System.out.println("Increments 0-9");
        for (int i=0; i < 10; i++){
            System.out.println(i);
        }

        System.out.println("Decrements 100-1");
        for (int i = 100; i > 0 ;i--){
            System.out.println(i);
        }

        // 1,3,5 Odd
        // 2,4,6 Even
        System.out.println("Odd or Even?");
        for (int i = 1; i <= 6; i++){
            if (i % 2 == 0){
                System.out.println("Number " + i + " is a Even Number!");
            }else {
                System.out.println("Number " + i + " is a odd Number!");
            }
        }
        */

    }

    static double addition(double num1, double num2){
        double result = num1 + num2;
        return result;
    }

    static void greetings(String groupName){
        System.out.println("Greeting: " + groupName);
    }

}
class Person{

    String firstName;
    String lastName;
    int birthYear;

    public String getPersonInformation(){
        return firstName + " " + lastName + " Age: " + (2023 - birthYear);
    }

}