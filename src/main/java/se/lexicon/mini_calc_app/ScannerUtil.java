package se.lexicon.mini_calc_app;

import java.util.Scanner;

class ScannerUtil {

    static String getStringFromUser(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    static double getDoubleFromUser(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextDouble();
    }
}
