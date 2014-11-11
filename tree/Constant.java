package tree;

/**
 * Write a description of class Constant here.
 * 
 * @author (your name) 
 * @version (a version Constant or a date)
 */
public class Constant implements Expr
{
    // instance variables - replace the example below with your own
    private int value;

    /**
     * Constructor for objects of class Constant
     */
    public Constant(int value)
    {
        this.value = value;
    }

    public Expr getLeft()
    {
        return this;
    }

    public Expr getRight()
    {
        return this;
    }

    public String toString()
    {
        return value + "";
    }

    public Expr simplify()
    {

        this.eval();
        return this;
    }

    public int eval ( )
    {
        return value;
    }

    public int getValue()
    {
        return value;
    }

}
