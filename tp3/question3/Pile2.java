package question3;

import question1.PilePleineException;
import question1.PileVideException;

import java.util.Stack;

public class Pile2<T> implements PileI<T>{
    /** par délégation : utilisation de la class Stack */
    private Stack<T> stk;
    /** la capacité de la pile */
    private int capacite;

    /** Création d'une pile.
     * @param taille la "taille maximale" de la pile, doit être > 0
     */
    public Pile2(int taille){
        stk = new Stack<T>();
        if (taille < 0)
            
            capacite = stk.capacity();
        else
        {
            capacite = taille;
        }
    }

    public Pile2(){
        this((new Stack<T>()).capacity());
    }
    
    public void empiler(T o) throws PilePleineException{
        if (estPleine())
            throw new PilePleineException();
        stk.push(o);
    }

    public T depiler() throws PileVideException{
        if (estVide())
            throw new PileVideException();
        return stk.pop();
    }

    public T sommet() throws PileVideException{
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

} // Pile2