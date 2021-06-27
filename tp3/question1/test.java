package question1;


/**
 * Write a description of class test here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class test 
{
    public static void main(String [] args) throws question1.PileVideException 
    {
        Pile p = new Pile(5);
        
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
        System.out.println("Pile avant : " + p.toString());
        p.depiler();
        System.out.println("Pile apres : " + p.toString());
    }
    
}
