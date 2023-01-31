package com.company;

public class Etoile implements ExpregBase {
    private Expreg exp;

    public Etoile(Expreg exp) {
        this.exp = exp;
    }

    @Override
    public String toString() {
        return "(" + exp + ")*";
    }
}
