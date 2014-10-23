package list; 
/**
 * Write a description of class LinkedList here.
 * 
 * @author (Peter Singley) 
 * @version (a version number or a date)
 *

 **
 * 
 * Some notes on iterators-
 * 
 * Iterator<> = myList.iterator();
 * itty = new Iterator;
 * 
 * while(itty.hasNext())
 * print(itty.next())
 * 
 * 
 * Iterator can "remember" where we are in the collection.
 * It provides services.
 * 
 * Are there more elemtns?
 * value of the next element.
 * remove the last one obtained.
 * 
 * 
 */

public class LinkedList<E> implements List<E>
{
    Node<E> head = new Node<E>(null, null,null);
    Node<E> tail = new Node<E>(null,null,head);

    int size = 0;

    private Node<E> ref;
    public LinkedList()
    {
        head.next = tail;
    }

    public int size()
    {
        return size;
    }

    public void add(E value)
    {
        //ref refers to position ndx.
        Node<E> temp = new Node<E>(value,tail,tail.prev);
        tail.prev.next = temp;
        tail.prev = temp;

        size++;

    }

    public void add(int ndx, E value)
    {
        setRef(ndx);

        Node<E> temp = new Node<E>(value,ref,ref.prev);
        ref.prev.next = temp;
        size++;
        /*
        for(int i = 0; i < ndx; i++)
        ref = ref.next; // ref refers to position ndx - 1
        ref.next = new Node(value, ref.next);
        size++;
        if(ref == tail) // inserting at end?
        tail = tail.next;

         */
    }

    private void setRef(int ndx)
    {
        //set ref to the given position

        if(ndx>size/2)
        {
            ref = tail;
            for(int i = size; i>ndx; i--){

                ref = ref.prev;
            }

        } else {
            ref = head.next;
            for (int i=0; i<ndx; i++)
            {

                ref = ref.next;

            }
        }
    }

    public E get(int ndx)
    {
        setRef(ndx);
        return ref.value;

        /*
        Node<E> ref = head.next;
        for(int i = 0; i < ndx; i++)
        ref = ref.next;

        //Ref refers to node at position ndx.

        return ref.value;
         */
    }

    public E set(int ndx, E value)
    {
        setRef(ndx);

        E result = ref.value;

        ref.value = value;

        return result;

        /*Node<E> ref = head.next;
        for (int i = 0; i < ndx; i++)
        ref = ref.next;

        return result;
         */
    }

    public E remove(int ndx)
    {
        setRef(ndx); // ref refers to the node being removed

        ref.prev.next = ref.next;

        ref.next.prev = ref.prev;
        size--;

        return ref.value;

        /*
        Node<E> ref = head;
        for(int i = 0; i < ndx; i++)
        ref = ref.next;
        E result = ref.next.value;

        if(tail == ref.next) //removing tail?
        tail = ref;

        ref.next = ref.next.next;
        size--;
        return result;

         */
    }

    public void clear()
    {
        head.next = tail;
        tail.prev = head;
        size = 0;
    }

    public boolean isEmpty()
    {
        return size == 0;
    }

    public int indexOf (Object value)
    {

        ref = head.next;

        for (int i=0; i<size; i++)
        {
            if(ref.value.equals(value))
            {
                return i;
            }

            ref = ref.next;
        }

        return -1;

        /*   Node<E> ref = head.next;
        int result = -1;

        for (int i = 0; i<size; i++){

        if (ref.value.equals(value))
        {
        result = i;
        }
        ref = ref.next;

        }
        return result;*/
    }

    public boolean contains (Object value) {
        return indexOf(value) != -1;
    }

    public String toString()
    {
        Node<E> ref = head.next;
        String result = "|||";
        for(int i = 0; i<size; i++) {
            result += ref.value;
            if (i != size-1){
                result+=" ";
            }
            ref = ref.next;
        }

        result = result + "|||" + "\n";
        return result;
    }

    public boolean equals(Object other)
    {
        /*
        if(!(other instanceof List))
        {
        return false;           
        }

        other = (List) other;
        if(size()!= other.size()){
        return false;}

        if(size() == 0)
        {
        return true;
        }

        if (get(0).equals(other.get(0)))
        {

        return false;
        }

        List<E> rest = new LinkedList<E>(this);
        rest.remove(0);

        List otherRest = new LinkedList(other);
        otherRest.remove(0);

        return rest.equals(otherRest);*/

        //Below is proven working, commented for testing alternative recursion method.

        Node<E> ref = head.next;
        List<E> localOther;

        if (!(other instanceof List)) {
            return false;

        } 

        else 
        {  
            localOther = (List) other;                 

            if (localOther.size() == size) {

                Iterator<E> it = localOther.iterator();

                while (it.hasNext()){

                    if(it.next() != ref.value) 
                    {  return false;}
                    ref = ref.next;
                }

            } else return false;

        }

        return true;

    }

    public Iterator<E> iterator()
    {
        return new RefIterator (this);
    }

    public boolean hasDuplicate()
    {
        return false;

    }

    public ListIterator<E> listIterator()
    {
        return new RefListIterator<E>(this);
    }

    public ListIterator<E> listIterator(int ndx)
    {
        return new RefListIterator<E>(this,ndx);

    }

    /**
     * Pre: E is comparable
     */
    public void bubbleSort()

    {
        Node<E> ref;

        int cmp;

        for(int i = 0;i<size()-1;i++)
        {
            ref = head.next;

            for(int j = 0;i<size()-1-i;j++)
            {

                cmp = ((Comparable)ref.value).compareTo(ref.next.value);

                if(cmp>0)
                    swap(ref);
                ref=ref.next;

            }
        }
    }

    private void swap(Node<E> ref)
    {
        /**
         * swap ref with its next neighbor.
         */    

        E temp = ref.value;

        ref.value = ref.next.value;

        ref.next.value = temp;

            
    }

}
