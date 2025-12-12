package org.example;

public class Szyfr {
    private String tekstJawny;
    private int klucz;

    public Szyfr(String tekstJawny, int klucz) {
        this.tekstJawny = tekstJawny;
        this.klucz = klucz;
    }

    public String szyfrujTekst() {
        final String alfabet = "abcdefghijklmnopqrstuvwxyz";
        StringBuilder zaszyfrowanyTekst = new StringBuilder();
        for (int i = 0; i < tekstJawny.length(); i++) {
            if (!alfabet.contains(String.valueOf(tekstJawny.charAt(i)))) {
                zaszyfrowanyTekst.append(tekstJawny.charAt(i));
                continue;
            }
            int indeksZnaku = alfabet.indexOf(tekstJawny.charAt(i));
            zaszyfrowanyTekst.append(alfabet.charAt(indeksZnaku + klucz % alfabet.length()));
        }
        return zaszyfrowanyTekst.toString();
    }
}
