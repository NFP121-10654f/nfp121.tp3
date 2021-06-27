package question2;

import question1.PilePleineException;
import question1.PileVideException;

import java.util.Stack;

public class Pile2 implements PileI {
    /** par delegation : utilisation de la class Stack */
    private Stack<Object> stk;

    /** la capacite de la pile */
    private int capacite;

    /**
     * Creation d'une pile.
     * 
     * @param taille
     *            la taille de la pile, la taille doit etre > 0
     */
    public Pile2(int taille) {
        stk = new Stack<Object>();
        if (taille < 0)
            
            capacite = stk.capacity();
        else
        {
            capacite = taille;
        }
    }

    // constructeur fourni
    public Pile2() {
        this((new Stack<Object>()).capacity());
    }

    public void empiler(Object o) throws PilePleineException {
        if (estPleine())
            throw new PilePleineException();
        stk.push(o);
    }

    public Object depiler() throws PileVideException {
        // a completer
        if (estVide())
            throw new PileVideException();
        return stk.pop();
    }

    public Object sommet() throws PileVideException {
        // a completer
        return stk.peek();
    }

    /**
     * Effectue un test de l'etat de la pile.
     * 
     * @return vrai si la pile est vide, faux autrement
     */
    public boolean estVide() {
        // a completer
        return stk.empty();
    }

    /**
     * Effectue un test de l'etat de la pile.
     * 
     * @return vrai si la pile est pleine, faux autrement
     */
    public boolean estPleine() {
        // a completer
        if(stk.size()<capacite) return false;
        return true;
    }

    /**
     * Retourne une representation en String d'une pile, contenant la
     * representation en String de chaque element.
     * 
     * @return une representation en String d'une pile
     */
    public String toString() {
        String s = "[";
        for (int i = taille()-1 ; i>=0 ; i--)
        {
            s += stk.get(i);
            if (i>0) s+=", ";
        }
        
        return s + "]";
        //return stk.toString();
    }

    public boolean equals(Object o) {
        if(o instanceof Pile2)
        {
            Pile2 p = (Pile2)o;
            if(p.capacite() == this.capacite())
            {
                return this.stk.equals(p.stk);
            }
            else return false;
        }
        
        return false;
    }

    // fonction fournie
    public int hashCode() {
        return toString().hashCode();
    }

    /**
     * Retourne le nombre d'element d'une pile.
     * 
     * @return le nombre d'element
     */
    public int taille() {
        // a completer
        return stk.size();
    }

    /**
     * Retourne la capacite de cette pile.
     * 
     * @return le nombre d'element
     */
    public int capacite() {
        // a completer
        return capacite;
    }

} // Pile2.java
