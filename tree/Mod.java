package tree;

/**
 * Write a description of class Mod here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Mod implements Expr
{
    Expr left,right;
    Expr zero;
    Expr one;

    /**
     * Constructor for objects of class Mod
     */
    public Mod(Expr left,Expr right)
    {
        
        this.left = left;
        this.right = right;
         zero = new Constant(0);
         one = new Constant(1);
    
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
        return "(" + left + "%" + right + ")";
    }
    
    public Expr simplify()
    {
        left  = left.simplify();
        right = right.simplify();
        
        
        if (left.equals(right))
        return zero;
        
        if (right.equals(one))
        return zero;
        
        return this;
        
    }
    
    public boolean equals(Object obj)
    {
        if(!(obj instanceof Mod))
        return false;
        
        Mod other = (Mod) obj;
        
        
        return (this.getLeft().equals(other.getLeft()) && this.getRight().equals(other.getRight()));
    }
    
    public int eval ( )
    {
        return 0;
    }
}