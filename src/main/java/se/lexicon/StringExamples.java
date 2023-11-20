package se.lexicon;

public class StringExamples {
    public static void main(String[] args) {

        basicString();
        concatenateString();
    }

    private static void basicString() {
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
    }

    private static void concatenateString() {
        String firstName = "Simon";
        String lastName = "Elbrink";
        int birthYear = 1997;

        String personInformation = firstName + " " + lastName + " Age: " + (2023 - birthYear);

        System.out.println("personInformation = " + personInformation);

//        firstName.concat(" Robert");
//        firstName = firstName.concat(" Robert");

        System.out.println(firstName);

        System.out.println(firstName.concat(" Robert"));
    }
}
