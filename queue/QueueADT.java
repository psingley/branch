package queue;

/**
 * Write a description of class DSF here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public interface QueueADT<E>
{

    /**
     * Add the given value to the back of this queue.
     */

    void add (E value);

    /**
     * Remove the value at the front of this Queue.
     * @return the value removed.
     * Pre:This queue is not empty
     */
    E remove ();

    /**
     * @return the value at the front of this queue,
     * or null if this queue is empty.
     */
    E peek();

    int size();

    void removeAll ();


    boolean equals (Object obj);

    String toString();
    
    boolean isEmpty();
    
}
