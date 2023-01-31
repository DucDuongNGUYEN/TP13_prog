package com.company;

public class Symbole implements ExpregBase {
    private Character symbole;

    public Symbole(char symbole) {
        this.symbole = symbole;
    }

    public String toString() {
        return "" + symbole;
    }
}
