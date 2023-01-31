package com.company;

abstract class ExpregBinaire extends ChaineFactory implements Expreg {
    private Expreg exp1;
    private String op;
    private Expreg exp2;

    public ExpregBinaire(Expreg exp1, String op, Expreg exp2) {
        this.exp1 = exp1;
        this.op = op;
        this.exp2 = exp2;
    }

    public String toString() {
        return "(" + exp1.toString() + op + exp2.toString() + ")";
    }
}
