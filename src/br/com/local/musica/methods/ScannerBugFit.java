package br.com.local.musica.methods;

import java.util.Scanner;

public class ScannerBugFit {
    static Scanner scanner = new Scanner(System.in);
    public static String scannerBugFitString(){
        String string = scanner.next();
        return string;
    }

    public static int scannerBugFitInt(){
        int integration = scanner.nextInt();
        return integration;
    }

}
