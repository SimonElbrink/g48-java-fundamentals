package se.lexicon;

import java.util.Arrays;
import java.util.Collections;

public class ArrayUtilDemo {
    public static void main(String[] args) {
        String[] names = {"Simon", "erik", "Ulf", "Fredrik", "Jonas", "Kent", "Marcus", "Martina"};

        names = addNameToArray(names, "Mehrdad");
        names = addNameToArray(names, "Tobias");

//        for (String element :
//                names) {
//            System.out.println(element);
//        }

//        System.out.println(names);
        System.out.println( Arrays.toString(names));






//        ex4();
    }


    public static void ex1(){
        String[] names = {"Simon", "erik", "Ulf", "Fredrik", "Jonas", "Kent", "Marcus", "Martina"};

        //Arrays.<methodName>
//        Arrays.sort(names);
        Arrays.sort(names, String.CASE_INSENSITIVE_ORDER);

        for (String name : names) {
            System.out.println(name);
        }

        System.out.println("--------");

        Integer[] numbers = {6,8,7,4,9,11};
//        Arrays.sort(numbers);
        Arrays.sort(numbers, Collections.reverseOrder());

        for (int number : numbers) {
            System.out.println(number);
        }

    }


    public static void ex2(){

        int[] numbers = {700, 900, 200, 4555, 34500, 445000, 600000};

        Arrays.sort(numbers);
        int position = Arrays.binarySearch(numbers,200);

        System.out.println(position);

    }

    public static void ex3(){

        int[] numbers = {10,20,30,40};

        int[] shorterCopy = Arrays.copyOf(numbers,2); //{10, 20}
        int[] biggerCopy = Arrays.copyOf(numbers,numbers.length + 1); //{10, 20, 30, 40, 0}

        //{10, 20, 30, 40, 50}
        biggerCopy[biggerCopy.length - 1]  = 50;

        for (int number : biggerCopy) {
            System.out.println(number);
        }
    }

    public static void ex4(){

        char[] letters = new char[]{'J', 'A', 'V', 'A'};

        char[] referenceToOriginalArray = letters;

        char[] copyOfOriginalArray = Arrays.copyOf(letters, letters.length);

        letters[0] = 'L';


        System.out.println("OriginalArray");
        for (char c : letters) {
            System.out.print(c + " ");
        }
        System.out.println("\n");

        System.out.println("ReferenceToOriginalArray");
        for (char c : referenceToOriginalArray) {
            System.out.print(c + " ");
        }
        System.out.println("\n");

        System.out.println("copyOfOriginalArray");
        for (char c : copyOfOriginalArray) {
            System.out.print(c + " ");
        }


    }

    public static String[] addNameToArray(String[] source, String name){
        String[] newArray = Arrays.copyOf(source, source.length +1);
        newArray[newArray.length -1] = name;
        return newArray;
    }
}
