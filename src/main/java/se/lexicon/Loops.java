package se.lexicon;

import java.util.Scanner;

public class Loops {


    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
         adultCheck();
         doWhileLoopExample();
         forLoopExamples();
         breakAndContinueInLoopExamples();

    }


    /**
     * WHILE LOOP
     * A loop that continues to loop if your enter an age of 18 or above.
     * Loop is terminated if year is below 18.
     * loop is evaluated by an expression
     * Example. Age = 18 -> Loop Continues
     *          Age = 15 -> Loop ends
     */
    public static void adultCheck(){
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

    }

    /**
     * Do-While-Loop
     * Even if expression in while-loop is false
     *  Do-while loop runs at least one time.
     */
    public static void doWhileLoopExample(){
        int number = 5;
        do{
            number++;
        }
        while(number != 0 && number <5); // false

        System.out.println(number);


        /*
         * Do-while loop runs at least one time.
         */
        do {
            System.out.println("Just ones, no more.");
        }while(false);


    }

    /**
     * FOR-LOOP
     */
    public static void forLoopExamples(){


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
    }

    /**
     * BREAK & CONTINUE IN LOOPS
     */
    public static void breakAndContinueInLoopExamples(){

        while(true){ // Creates an infinite loop.
            break; // Terminates the While Loop.
        }

        /**
         * A loop that continues to loop if your enter an age of 18 or above.
         * Loop is terminated if year is below 18.
         * loop is evaluated by an expression
         * Example. Age = 18 -> Loop Continues
         *          Age = 15 -> Loop ends
         */
        while (true) { // Infinite Loop
            System.out.println("How old are you?");
            int age = scanner.nextInt();

            if (age >= 18) {
                System.out.println("You are an adult!");
            } else {
                System.out.println("You are a child!");
                break; // Ends Loop Construct
            }
        }
        System.out.println("Done!");


        /**
         * Iterates from 0-9 prints the int value.
         * Except for value 5 then text "Five" is printed.
         */
        for (int i = 0; i < 10 ;i++){
            if (i == 5){
                System.out.println("Five");
                continue;
            }
            System.out.println(i);
        }
    }
}
