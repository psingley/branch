package queue;
import list.*;

/**
 * Write a description of class lkasd here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ArrayQueue<E> implements QueueADT<E>
{

    List<E> values = new ArrayList<E>();

    int front = 0, //position of front
    back = 0,  //Next available position
    size = 0;  //size of Queue

    public void add (E value)

    {
        if(size == values.size())
        {
            //List is full
            values.add(back,value);
            size++;
            back=(back+1)%values.size();
            front=(front+1)%values.size();
        } else
        {
            //List is not full
            values.set(back,value);
            back=(back+1)%values.size();
        }

    }

    public E remove()
    {

        size--;
        E result = values.get(front);
        front = (front+1)%values.size();
        return result;

    }

    public E peek()
    {
        if (size == 0){
            return null;}
        return values.get(front);

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
    