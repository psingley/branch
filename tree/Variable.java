package tree;

/**
 * Write a description of class Variable here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Variable implements Expr
{
    char name;

    public Variable (char name)
    {this.name = name;}

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
        return name + "";
    }

    public Expr simplify()
    {
        this.eval();
        return this;
    }

    public int eval ( )
    {
        return 0;
    }
    
    public boolean equals(Object obj)
    {
        if (!(obj instanceof Variable)){
            return false;
        }
        
        Variable other = (Variable) obj;
        return (name==other.name);
    }

}
