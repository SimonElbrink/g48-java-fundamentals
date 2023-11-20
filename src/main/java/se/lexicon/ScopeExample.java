package se.lexicon;


/**
 * Class Scope
 * Method Scope
 * Block Scope
 * Field Variable vs Local Variable scopes
 */
public class ScopeExample { //Start of Class Scope

    static int result = 9000; // Field Variable (variable in class scope)
    static int counter = 100;

//    static int i = 100; // Not a good name for a field variable, OKEY in FOR-LOOP

    public static void main(String[] args) {

        int result = 40;

        System.out.println("result = " + result); //Print the Local variable (Closest found) = 40

        System.out.println("ScopeExample.result = " + ScopeExample.result); //Print The field variable in class scope. = 9000

//        System.out.println(ScopeExample.counter);
        System.out.println("counter = " + counter); // Found in class Scope, no need for className.
                                     // since there is no variable with this name in current scope.

    }


    public static void methodScope(){ //Start of Method Scope

        int result = 100;

        System.out.println(result);


        // Local Variable call "i"
        //       |
        //       V
        for (int i = 0; i < 10; i++) { // Block Scope
            System.out.println(i);
        }

//        System.out.println(i); // Can't Access i from this inner-scope


    } //End of Method Scope



} //End of Class Scope
