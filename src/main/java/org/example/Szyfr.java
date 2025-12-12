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
            if (!alfabet.contains(String.valueOf(znak))) {
                zaszyfrowanyTekst.append(znak);
                continue;
            }
            int indeksZnaku = alfabet.indexOf(znak);
            char przesunietyZnak = alfabet.charAt((indeksZnaku + klucz) % alfabet.length());
            zaszyfrowanyTekst.append(przesunietyZnak);
        }
        return zaszyfrowanyTekst.toString();
    }
}
