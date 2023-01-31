package com.company;

public class Main {

    public static void main(String[] args) {
/*
        Epsilon e = new Epsilon();
        Symbole a = new Symbole('a');
        System.out.println(e.toString()); // affiche : &
        System.out.println(a.toString()); // affiche : a
        Symbole a = new Symbole('a');
        Etoile star = new Etoile(a);
        Etoile star2 = new Etoile(star);
        System.out.println(star.toString()); // affiche : (a)*
        System.out.println(star2.toString()); // affiche : ((a)*)*

        Concat c = new Concat(new Symbole('a'), new Symbole('b'));
        Etoile star = new Etoile(new Somme(new Epsilon(), c));
        System.out.println(star.toString()); // affiche : ((&+( a.b)))

        Expreg e = ChaineFactory.creeChaine("");
        Expreg s = ChaineFactory.creeChaine("s");
        Expreg abcd = ChaineFactory.creeChaine(" abcd ");
        System.out.println(abcd.toString()); // affiche : (a.(b.(c.d)))
 */
        Symbole a = new Symbole('a');
        ConcatLight c = new ConcatLight(a, new Somme(a, new ConcatLight(a, a)));
        System.out.println(c.toString()); // affiche : (a.(a+aa))


    }
}
