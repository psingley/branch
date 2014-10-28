package tree;


/**
 * Write a description of class Number here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Number implements Expr
{
    // instance variables - replace the example below with your own
    private int value;

    /**
     * Constructor for objects of class Number
     */
    public Number()
    {
        this.value = value;
    }

    public Expr getLeft()
    {
        return null;
    }
    
    public Expr getRight()
    {
        return null;
    }
    
    
    public String toString()
    {
        return value + "";
    }
    
    public Expr simplify()
    {
        return this;
    }
    
    
}
