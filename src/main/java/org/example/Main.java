package org.example;

public class Main {
    public static void main(String[] args) {
        Szyfr szyfr = new Szyfr("ab c", 1);
        System.out.println(szyfr.szyfrujTekst());
    }
}