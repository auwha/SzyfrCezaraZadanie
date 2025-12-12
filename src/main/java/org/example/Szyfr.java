package org.example;

public class Szyfr {
    private String tekstJawny;
    private int klucz;
    private final String alfabet = "abcdefghijklmnopqrstuvwxyz";

    public Szyfr(String tekstJawny, int klucz) {
        this.tekstJawny = tekstJawny;
        this.klucz = klucz % alfabet.length();
    }

    public String szyfrujTekst() {
        if (klucz < 0)
            klucz += alfabet.length();

        StringBuilder zaszyfrowanyTekst = new StringBuilder();
        for (char znak : tekstJawny.toCharArray()) {
            if (alfabet.contains(String.valueOf(znak))) {
                int przesunietyIndeks = alfabet.indexOf(znak) + klucz;
                znak = alfabet.charAt(przesunietyIndeks % alfabet.length());
            }
            zaszyfrowanyTekst.append(znak);
        }
        return zaszyfrowanyTekst.toString();
    }
}
