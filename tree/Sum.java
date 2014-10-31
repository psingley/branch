package tree;

/**
 * Write a description of class Sum here.
 * 
 * @author (your name) 
 * @version (a version Constant or a date)
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
        return left;
    }

    public Expr getRight()
    {
        return right;
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
            return new Product (new Constant(2),left);
            
           // else if (left instanceof Constant && ((Constant)left).getValue))
            
            return this;

    }
    public boolean equals(Object obj)
    {
        if(!(obj instanceof Sum))
            return false;

        Sum other = (Sum)obj;
        return left.equals(other.left) && right.equals(other.right) || left.equals(other.right) && right.equals(other.left);

    }

    public int eval ( )
    {
        if(left instanceof Constant && right instanceof Constant)
        {
            return ((Constant)left).getValue() + ((Constant)right).getValue();
        }
        return 1;
    }

}
