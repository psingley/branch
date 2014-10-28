package treeDriver;

import tree.*;
import list.*;

/**
 * Test the binary search tree implementation.
 * 
 * @author (sdb) 
 * @version (Oct 2014)
 */
public class Driver07
{

    public static void main( )
    {
        BinaryTree <String> kids = new EmptyBinarySearchTree <String> ();

        if (!kids.isEmpty ())
            System.out.println ("Not correct 1");

        kids = kids.add ("kimmy");
        kids = kids.add ("jimmy");
        kids = kids.add ("susie");
        kids = kids.add ("joe");
        kids = kids.add ("sue");
        kids.toString();

        if (kids.isEmpty ())
            System.out.println ("Not correct 2");

        //if (! (kids.get("sue")).equals ("sue"))
        //      System.out.println ("Not correct 3");

        if (kids.containsKey ("kim"))
            System.out.println ("Not correct 3");
        if (!(kids.containsKey ("kimmy")))
            System.out.println ("Not correct 4");
        System.out.println ("Testing problem 2, completed");

        //Testing problem 3
        //Uncomment the following when ready to test problem 3
        if (kids.equals ("kids"))
            System.out.println ("Not correct 5");

        BinaryTree <String> friends = new EmptyBinarySearchTree <String> ();
        if (kids.equals (friends))
            System.out.println ("Not correct 6");
        if (friends.equals (kids))
            System.out.println ("Not correct 7");

        friends = friends.add ("kimmy");
        friends = friends.add ("jimmy");
        friends = friends.add ("susie");
        friends = friends.add ("joe");
        if (kids.equals (friends))
            System.out.println ("Not correct 8");
        if (friends.equals (kids))
            System.out.println ("Not correct 9");

        friends = friends.add ("sue");

        if (!kids.equals (friends))
            System.out.println ("Not correct 10");
        if (!friends.equals (kids))
            System.out.println ("Not correct 11");
        System.out.println ("Testing problem 3, completed");
    }

}