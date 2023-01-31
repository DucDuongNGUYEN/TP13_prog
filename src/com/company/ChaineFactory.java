package com.company;

public class ChaineFactory implements Expreg{
    public static Expreg creeChaine(String chain){
        if(chain.isEmpty()) return (new Epsilon());
        if(chain.length() == 1) return (new Symbole(chain.charAt(0)));
        Concat c = (new Concat(new Symbole(chain.charAt(chain.length()-2)), new Symbole(chain.charAt(chain.length()-1))));
        if(chain.length() > 2) {
            for (int i = chain.length() - 3; i >= 0; i--) {
                c = new Concat(new Symbole(chain.charAt(i)), c);
            }
        }
        return c;
    }
}
