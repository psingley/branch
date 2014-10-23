package list;

/**
 * Write a description of class RefIterator here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RefIterator<E> implements Iterator<E>
{
    Node<E> cursor;

    LinkedList<E> theList;

    //cursor refers to the last value returned by next.

    public RefIterator(LinkedList<E> theList)
    {

        this.theList = theList;
        cursor = theList.head;

    }

    public boolean hasNext()
    {
        return cursor.next != theList.tail;
    }

    public E next()
    {

        cursor = cursor.next;
        return cursor.value;
    }

    public void remove()
    {

        cursor.prev.next = cursor.next;
        cursor.next.prev = cursor.prev;

        cursor = cursor.prev;

        theList.size--;

    }

    public boolean hasTwoMore()
    {

        if(cursor.next.equals(theList.tail))
        {
            return false;
        } else

            return cursor.next != theList.tail.prev;
    }

    public void remove2()
    {
        remove();
        cursor=cursor.next;
        remove();

        /*cursor.prev.next = cursor.next.next;
        cursor.next.next.prev = cursor.prev;
        theList.size = theList.size-2;
        cursor=cursor.prev;*/

    }
}
