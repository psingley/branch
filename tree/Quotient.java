package tree;

/**
 * Write a description of class Quotient here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Quotient implements Expr
{
    Expr left,right;

    /**
     * Constructor for objects of class Quotient
     */
    public Quotient(Expr left,Expr right)
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
        return "(" + left + "/" + right + ")";
    }
    
    public Expr simplify()
    {
        left  = left.simplify();
        right = right.simplify();
        
        if (left.eval()==right.eval())
        return new Constant(1);
        
        return this;
        
    }
    
    public boolean equals(Object obj)
    {
        if(!(obj instanceof Quotient))
        return false;
        
        Quotient other = (Quotient) obj;
        
        
        return (left.equals(other.left) && right.equals(other.right));
    }
    
    public int eval ( )
    {
        return left.eval() / right.eval();
    }
}
