package stack;

import list.*;
/**
 * Implementation of a LIFO data structure.
 * 
 * @author Peter Singley
 * @version 91814
 */
public class Stack<E> implements StackADT<E>
{

    List<E> values = new LinkedList<E>();

    public Stack()
    {

    }

    public E push(E value)
    {

        values.add(value);

        return value;

    }

    public E pop()
    {
        return values.remove(values.size()-1);

    }

    public E peek()
    {
        return values.get(values.size()-1);

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

        Stack<E> localOther; 

        if (obj instanceof Stack) {
            localOther = (Stack<E>) obj;
            return values.equals(localOther.values);
        } 

        else 
        {  
            return false;

        }


        
    }

}
