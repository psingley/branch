package tree;

/**
 * Write a description of class Product here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Product implements Expr
{
    Expr left,right;
    Expr zero;
    Expr one;

    /**
     * Constructor for objects of class Product
     */
    public Product(Expr left,Expr right)
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
        return "(" + left + "*" + right + ")";
    }

    public Expr simplify()
    {
        left = left.simplify();
        right = right.simplify();
        if(left.eval()==0)
            return zero;

        if(right.eval()==0)
            return zero;

        if(left.eval()==1)
            return right;

        if(right.eval()==1)
            return left;

        return this;
    }

    public boolean equals(Object obj)
    {
        if(!(obj instanceof Product))
            return false;

        Product other = (Product)obj;
        return left.equals(other.left) && right.equals(other.right) || right.equals(other.right) && left.equals(other.left);

    }

    public int eval ( )
    {
        return left.eval() * right.eval();
    }

}
