package treeDriver;
import tree.*;
import list.Iterator;

/**
 * Lab 8.
 * 
 * @author (sdb) 
 * @version (Oct 2014)
 */
public class Lab08

{
    public static void main()
    {    
        BinaryTree <Character> chars = new BinarySearchTree ('m');
        chars.add ('c');
        chars.add ('b');
        chars.add ('a');
        chars.add ('p');
        chars.add ('g');

        Iterator <Character> itty = chars.iterator();
        while (itty.hasNext())
            System.out.print (itty.next());
        System.out.println ();

        // remove all letters after 'c'
        itty = chars.iterator();
        while (itty.hasNext())
            if (itty.next() > 'c')
                itty.remove();

        itty = chars.iterator();
        while (itty.hasNext())
            System.out.print (itty.next());
        System.out.println ('\n');

        //////// Uncomment the following lines when ready for problem 2
        Expr e1 = new Sum (new Variable('x'), new Variable('y'));       //  x + y
        Expr e2 = new Sum (new Variable('y'), new Variable('x'));       //  y+x
        e2 = new Difference (e1, e2);                                   // (x+y) - (y+x)
        System.out.println (e2);
        System.out.println ("Simplifies to " + e2.simplify());                             // 0
        System.out.println();

        Expr e = new Quotient (new Variable('x'), new Variable('x'));       // x / x
        e = new Product ( new Variable('y'), e);                    //   y * (x/x)
        e = new Difference (e, new Variable('y'));                   //   y * (x/x) - y
        e = new Sum (e, new Constant(1));                             //   (y * (x/x) - y) + 1
        e = new Mod (new Variable ('z'), e);                          //   z % ((y * (x/x) - y) + 1)
        System.out.println (e);
        System.out.println ("Simplifies to " + e.simplify());        //    0
        e1 = new Difference (new Variable ('a'), new Variable ('b'));
        e2 = new Difference (new Variable ('b'), new Variable ('a'));
        if (e1.equals (e2))
            System.out.println ("Not correct");
        e1 = new Quotient (new Variable ('a'), new Variable ('b'));
        e2 = new Quotient (new Variable ('b'), new Variable ('a'));
        if (e1.equals (e2))
            System.out.println ("Not correct");
        e1 = new Mod (new Variable ('a'), new Variable ('b'));
        e2 = new Mod (new Variable ('b'), new Variable ('a'));
        if (e1.equals (e2))
            System.out.println ("Not correct");

        Expr z = new Product ( new Variable('x'), new Constant(0));                    //   x * 0
        System.out.println (z);
        z.simplify();
        System.out.println (z);
        z = new Product ( new Variable('k'), new Constant(1));
        System.out.println (z);
        z.simplify();
        System.out.println (z);
        
    }
}