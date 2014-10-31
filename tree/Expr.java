package tree;

/**
 * Write a description of class Expr here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public interface Expr
{
    Expr getLeft();

    Expr getRight();

    String toString();

    Expr simplify();

    boolean equals(Object obj);

    /** @return the value of this Expr if it is a Constant */

    int eval ( );
}
