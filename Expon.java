
/**
 * Write a description of class Expon here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Expon
{

    private int counter = 0;

    public static void main (int n)
    {

        Expon t = new Expon();
        t.meth(n);
        
        result.add(it.next().key);

    }

    private void meth(int n)
    {

        counter++;
        
        System.out.println(counter);
        
        if (n<2)
            return;

        meth(n-1);
        meth(n-1);


    }


}