package tree;

/**
 * Write a description of class Difference here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Difference implements Expr
{
    Expr left,right;

    /**
     * Constructor for objects of class Difference
     */
    public Difference(Expr left,Expr right)
    {
        this.left = left;
        this.right = right;
    }

    public Expr getLeft()
    {
        return left;
    }

    public Expr getRight()
    {
        return right;
    }

    public String toString()
    {
        return "(" + left + "-" + right + ")";
    }

    public Expr simplify()
    {
        left = left.simplify();
        right = right.simplify();
        
        if(left.eval()==(right.eval()))
            return new Constant(0);
        if(left.equals(0))return right;
        if(right.equals(0))return left;

        
        return this;

    }

    public boolean equals(Object obj)
    {
        if(!(obj instanceof Difference))
            return false;

        Difference other = (Difference)obj;
        return left.equals(other.left) && right.equals(other.right);

    }

    public int eval ( )
    {
        return left.eval() - right.eval();
    }

}
