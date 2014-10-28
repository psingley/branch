package tree;

/**
 * Write a description of class Sum here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Sum implements Expr
{
    Expr left,right;

    /**
     * Constructor for objects of class Sum
     */
    public Sum(Expr left,Expr right)
    {
        this.left = left;
        this.right = right;
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
        return "(" + left + "+" + right + ")";
    }
    
    public Expr simplify()
    {
        left = left.simplify();
        right = right.simplify();
        if(left.equals(right))
        return new Product (new Number(2),left);
        
    }
    
    public boolean equals(Object obj)
    {
        if(!(obj instanceof sum))
        return false;
        
        Sum other = (sum)obj;
        return left.equals(other.left) && right.equals(other.right) || left.equals(other.right) && right.equals(other.left);
        
    }

}
