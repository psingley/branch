package list;

/**
 * Iterator for ArrayLists
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ArrayIterator<E> implements Iterator<E>
{

    int ndx = -1; //position of last element obtained from the list.

    List<E> theList; //the ArrayList which is being iterated through.
    ArrayIterator(List<E> theList)
    {
        this.theList = theList;               
    }

    ArrayIterator() //Should not be called. Just default constructor in case of tempermental compilers.
    {

    }

    public boolean hasNext()
    {

        return ndx < theList.size()-1;

    }

    public E next()
    {
        ndx++;
        return theList.get(ndx);
    }

    public void remove()
    {
        theList.remove(ndx);
        ndx--;

    }

    public boolean hasTwoMore()
    {
        /*boolean result = true;

        if(ndx<theList.size()-2)
        {result = true;}
        else {result = false;}

        return result;
         */

        return ndx < theList.size()-2;

    }

    public void remove2(){

    }

}
