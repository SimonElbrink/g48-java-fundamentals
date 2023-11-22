package se.lexicon;

public class StringExamples {
    public static void main(String[] args) {

//        basicString();
//        concatenateString();
//        length_charAt();
//        indexOf();
//        equals_contains_startsWith_endsWith();
//        replaceMethod();
//        trim();
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

    public static void length_charAt(){


        String name = "Simon Elbrink";

        System.out.println("name.length() = " + name.length());

        System.out.println("name.charAt(9) = " + name.charAt(9));

        System.out.println("name.charAt(name.length()-1) = " + name.charAt(name.length()-1));

        for (int i = 0; i < name.length(); i++) {
            System.out.println(name.charAt(i));
        }


//        System.out.println("name.charAt(1000) = " + name.charAt(1000));

    }

    public static void indexOf(){

        String name = "Simon Elbrink";

        System.out.println("name.indexOf('E') = " + name.indexOf('E'));
        System.out.println("name.indexOf(\"mon\") = " + name.indexOf("mon"));
        System.out.println("name.indexOf('i') = " + name.indexOf('i'));
        System.out.println("name.lastIndexOf('i') = " + name.lastIndexOf('i'));
        System.out.println("name.indexOf('i',5) = " + name.indexOf('i',5));


        String[] splitName = name.split(" ");

        System.out.println("splitName[0] = " + splitName[0]);
        System.out.println("splitName[1] = " + splitName[1]);



    }

    public static void subString(){
        // Substring
        String message = "I Love Programming in Java!";

        int indexOfP = message.indexOf("P");
        String messageShort = message.substring(indexOfP);
        System.out.println(messageShort);

        int indexOfL = message.indexOf("L");
        String messageLove = message.substring(indexOfL,indexOfL+4);
        System.out.println(messageLove);

        String[] messageArray = message.split(" ");

        System.out.println(messageArray[0]);
        System.out.println(messageArray[1]);
        System.out.println(messageArray[2]);
        System.out.println(messageArray[3]);
        System.out.println(messageArray[4]);
    }

    public static void equals_contains_startsWith_endsWith(){

        String message1 = "I Love Programming in Java!";
        String message2 = "i LOVe PrOgraMMing in JAVA!";

        boolean isTheSame = message1.equals(message2);
        boolean isTheSameIgnoreCase = message1.equalsIgnoreCase(message2);

        System.out.println("isTheSame = " + isTheSame);
        System.out.println("isTheSameIgnoreCase = " + isTheSameIgnoreCase);

        boolean OwnIgnoreCase = message1.toLowerCase().equals(message2.toLowerCase());
        System.out.println("OwnIgnoreCase = " + OwnIgnoreCase);

        boolean containIN = message1.contains("in");
        boolean containM = message1.contains("M");

        boolean startsWith = message1.startsWith("I Love");
        boolean endsWith = message1.endsWith("in");





    }

    public static void replaceMethod(){
        String message = "I Love Programming in Java!";

        message = message.replace("Love", "❤️");
        System.out.println(message);

        message = message.replace("in Java", "");
        System.out.println(message);
    }

    private static void trim() {
        String message = "         \n I Love\t Programming in Java! \t \t \n  ";

        System.out.println("message = " + message);
        System.out.println("message.trim() = " + message.trim());
    }


}











