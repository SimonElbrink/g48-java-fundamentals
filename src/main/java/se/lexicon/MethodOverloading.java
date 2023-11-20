package se.lexicon;

public class MethodOverloading {
    public static void main(String[] args) {

        System.out.println(add(50,100));
        System.out.println(   add(10.40, 15.90)   );
        System.out.println(   add(10,50,60,40,70,90,20,50)   );

    }

    public static int add(int number1, int number2){
        return number1 + number2;
    }

    public static double add(double decimal1, double decimal2){
        return decimal1 + decimal2;
    }


    public static int add(int...ints){ // Array of ints
        int result = 0;
        for (int number : ints) {
            result = result + number;
        }
        return result;
    }



}
