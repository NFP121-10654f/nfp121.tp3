package question2;

import question1.PilePleineException;
import question1.PileVideException;

import java.util.Vector;

/**
 * Décrivez votre classe PileVector ici.
 * 
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class Pile3 implements PileI {

    private Vector<Object> v;

    public Pile3() {
        this(new Vector().capacity());//default capacity = 10
    }

    public Pile3(int taille) {
        
        if (taille < 0)
            
            v = new Vector<Object>();//default capacity = 10
        else
        {
            v = new Vector<Object>(taille);
        }
    }

    public void empiler(Object o) throws PilePleineException {
        if (estPleine())
            throw new PilePleineException();
        v.add(o);
    }

    public Object depiler() throws PileVideException {
        if (estVide())
            throw new PileVideException();
        Object temp = v.lastElement();
        v.remove(v.lastElement());
        return temp;
    }

    public Object sommet() throws PileVideException {
        // à compléter
        return v.lastElement();
    }

    public int taille() {
        return v.size();
    }

    public int capacite() {
        return v.capacity();
    }

    public boolean estVide() {
        return v.isEmpty();
    }

    public boolean estPleine() {
        if(v.size() == v.capacity()) return true;
        return false;
    }

    public String toString() {
        String s = "[";
        for (int i = taille()-1 ; i>=0 ; i--)
        {
            s += v.get(i);
            if (i>0) s+=", ";
        }
        
        return s + "]";
    }

    public boolean equals(Object o) {
        if(o instanceof Pile3)
        {
            Pile3 p = (Pile3)o;
            if(p.capacite() == this.capacite())
            {
                return this.v.equals(p.v);
            }
            else return false;
        }
        
        return false;
    }

    // fonction fournie
    public int hashCode() {
        return toString().hashCode();
    }

}
