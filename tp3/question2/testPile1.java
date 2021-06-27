package question2;


/**
 * Write a description of class test here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class testPile1 
{
    public static void main(String [] args) throws question1.PileVideException 
    {
        Pile p = new Pile(9);
        
        try
        {
            p.empiler("rim");
            p.empiler(null);
            p.empiler(4);
            p.empiler(5);
            p.empiler(6);
            p.empiler(7);
        }
        catch (question1.PilePleineException ppe)
        {
            System.out.println("La pile " + p.toString() + " est pleine !");
        }
        
        System.out.println("Pile 1 "+p.toString());
        System.out.println("Le sommet de la pile 1 est : " + p.sommet());
        System.out.println("La capacité de la pile 1 est : " + p.capacite());
        System.out.println("La taille de la pile 1 est : " + p.taille());
        
        Pile p2 = new Pile(9);
        
        try
        {
            p2.empiler("rim");
            p2.empiler(null);
            p2.empiler(4);
            p2.empiler(5);
            p2.empiler(6);
            p2.empiler(7);
        }
        catch (question1.PilePleineException ppe)
        {
            System.out.println("La pile " + p2.toString() + " est pleine !");
        }
        System.out.println();
        System.out.println("Pile 2 " +p2.toString());
        System.out.println("Le sommet de la pile 2 est : " + p2.sommet());
        System.out.println("La capacité de la pile 2 est : " + p2.capacite());
        System.out.println("La taille de la pile 2 est : " + p2.taille());
        
        System.out.println();
        System.out.println(p.equals(p2));
    }
    
}
