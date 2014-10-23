package recursion;

/**
 * Write a description of class Quiz3P2 here.
 * 
 * @author Peter Singley
 * @version 101414
 */
public class Quiz3P2
{
    // instance variables - replace the example below with your own
    public int x;
    public int y;
    public int z;
    public int quotient;

    /**
     * Constructor for objects of class Quiz3P2
     */
    public Quiz3P2()
    {

    }

    public void part1 (int x, int y)
    {
        this.x = x; 
        this.y = y;

        this.z = 1+(x-y);

        
    }
    public int part2()
    {
        quotient = (z/y)+1;

        
        return quotient;
    }

    /** @return the quotient of a/b     
    @param a and b are positive
     */
    public int divide(int x, int y)
    {
        

        if(x<y)
        {
            return 0;

        }

        else 
        {
            part1(x,y);
            part2();
            System.out.println(" The quotient is " + part2());
            return part2();
        }

    }
}
