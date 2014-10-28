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
    }
    
    public Expr getRight()
    {
        
    }
    
    public String toString()
    {
        return name + "";
    }
    
    public Expr simplify()
    {
        return this;
    }
    

}

