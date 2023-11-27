package se.lexicon;

public class ArrayDemo {
    public static void main(String[] args) {

        //Initializing an Array
        String[] stringArrays = new String[3]; // [null, null, null]
        int[] numbers = new int[]{2, 4, 6, 9}; // [2, 4, 6, 9]
        char[] letters = {'J', 'A', 'V', 'A'};


//        String name0 = "Simon";
//        String name1 = "Erik";
//        String name2 = "Mehrdad";

//        String[] names = {"Simon", "Erik", "Mehrdad"};
//        System.out.println(names[1]);






        sortNumber();
    }

    public static void ex1(){

        String[] names = new String[3]; // [null, null, null]

        System.out.println(names.length);
        System.out.println("----------");
        names[0] = "Fredrik"; // ["Fredrik", null, null]
        names[2] = "Jonas"; // ["Fredrik", null, "Jonas"]
        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);
    }

    public static void ex2(){
        int[] numbers = {5, 2, 3, 4, 7};
        System.out.println(numbers.length);
        System.out.println("---------");

        printArray(numbers);
//        for(int i = 0; i < numbers.length; i++){
//            System.out.println(numbers[i]);
//        }

        numbers[1] = 4;
        printArray(numbers);

//        for (int i = 0; i < numbers.length; i++) {
//            System.out.println(numbers[i]);
//        }

        numbers[5] = 10; // throws exception -> java.lang.ArrayIndexOutOfBoundsException

    }

    public static void printArray(int[] numbers){
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }



    public static void ex3(){

        String[][] bord = new String[3][3];
        // ["O", "X", "X"]  // [0][0-3]
        // ["O", "X", "X"]  // [1][0-3]
        // ["O", "O", "O"]  // [2][0-3]

        bord[0][0] = "O";
        bord[0][1] = "X";
        bord[0][2] = "X";

        bord[1][0] = "O";
        bord[1][1] = "X";
        bord[1][2] = "X";

        bord[2][0] = "O";
        bord[2][1] = "O";
        bord[2][2] = "O";

        for (int i = 0; i < bord.length; i++) {
            for (int j = 0; j < bord[i].length; j++){
                System.out.print(bord[i][j] + "\t");
            }
            System.out.println("\n");
        }
    }

    public static void ex4(){

        int[] numbers = {2,3,5,6};

        //Can iterate forward, backwards and more ways
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        System.out.println("------");

        //Enhanced For-loop = For-Each-loop
        //Can only iterate from start to end
        for( int number : numbers){ // [2 ,3 ,5 ,6]
            System.out.println(number);
        }
    }

    public static void sortNumber(){
        int[] numbers = {5, 2, 3, 4, 7};
        // moving the number 5 to the right place. Comparing the next value.
        // {5, 2, 3, 4, 7}
        // {2, 5, 3, 4, 7}
        // {2, 3, 5, 4, 7}
        // {2, 3, 4, 5, 7}

        for (int i = 0; i < numbers.length;i++){

            for (int j = i + 1 ; j < numbers.length; j++) { // J is the next value in the Array
                if (numbers[i] > numbers[j]){ //5 > 2 // Flip if the I number is bigger then J

                    //Swapping the array Elements
                    int tmp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = tmp;
                }

            }
        }








    }



}









