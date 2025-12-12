package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Wpisz tekst do zaszyfrowania: ");
        String tekstJawny = scanner.nextLine();
        System.out.println("Wpisz klucz do szyfrowania: ");
        int klucz = scanner.nextInt();

        Szyfr szyfr = new Szyfr(tekstJawny, klucz);
        System.out.println("Zaszyfrowany tekst: " + szyfr.szyfrujTekst());
    }
}