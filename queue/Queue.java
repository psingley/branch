package queue;
import list.*;

/**
 * Write a description of class Queue here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Queue<E> implements QueueADT<E>
{

    List<E> values = new LinkedList<E>();

    /**
     * Constructor for objects of class Queue
     */
    public Queue()
    {

    }

    public void add(E value)
    {
        values.add(value);
    }

    public E remove()
    {
        
        
        return values.remove(0);
    }

   

    public E peek()
    {
        if(values.size()>0){
            return values.get(0);}
        return null;

    }

    public boolean isEmpty()
    {
        return values.isEmpty();
    }

    public void clear(){
        values.clear();

    }

    public String toString()
    {

        return values.toString();

    }

    public boolean equals(Object obj)
    {

        Queue<E> localOther; 

        if (obj instanceof Queue) {
            localOther = (Queue<E>) obj;
            return values.equals(localOther.values);
        } 

        else 
        {  
            return false;

        }

        
    }

    public void removeAll (){

        values.clear();
    }

    public int size()
    {

        return values.size();
    }
    
  
}
