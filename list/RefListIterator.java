package list;

/**
 * Write a description of class RefListIterator here.
 * 
 * @author Peter Singley 
 * @version 91814
 */
public class RefListIterator<E> extends RefIterator<E> implements ListIterator<E>
{

    //cursor refers to the last node returned by the call to next() or previous()

    boolean forward = true;

    RefListIterator(LinkedList<E> theList)
    {
        super(theList);
    }

    RefListIterator(LinkedList<E> theList,int ndx)
    {

        super(theList);
        for(int i=0;i<ndx;i++)
        {
            cursor = cursor.next;

        }

    }

    public boolean hasNext()
    {
        if(forward)
        {

            return cursor.next!=theList.tail;
        } else

            return theList.size()>0;

    }

    public E next()
    {
        if (forward){
            cursor = cursor.next;

        } 

        forward=true;

        return cursor.value;

    }

    public boolean hasPrevious()
    {
        if (!forward){
            return cursor.prev != theList.head;

        }

        return theList.size()>0;

    }

    public E previous()
    {
        if(!forward){
            cursor = cursor.prev;
        }

        forward = false;

        return cursor.value;

    }

    public void remove()
    {

        super.remove(); //will handle updating the cursor in superclass remove method.

        if(!forward) // unless we're going backwards. Then we need to undo the update to cursor by the super.remove().
        {
            cursor = cursor.next;

        }

    }

    public void add(E value)
    {
        //ref refers to position ndx.

        //Node<E> temp=null;

        if(forward){
            
            cursor = cursor.next;

            Node<E> temp = new Node<E>(value,cursor,cursor.prev);

            cursor.prev.next = temp;
            cursor.prev = temp;
            cursor = temp;

        } else
        {

            Node<E> temp = new Node<E>(value,cursor,cursor.prev);

            cursor.next.prev = temp;
            cursor.prev = temp;


        }
        
        theList.size++;
    } 
}
