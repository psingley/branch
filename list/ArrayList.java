package list;

/**
 * @Author (Peter Singley)
 */
public class ArrayList<E> implements List<E>
{
    int size = 0; // size of the ArrayList

    E [] values;

    public ArrayList()
    {
        this (10);
    }

    public ArrayList(int capacity)
    {
        values = (E[]) new Object[capacity];
    }

    public int size()
    {
        return size;
    }

    public void add(E value)
    {
        add(size,value);
    }

    public void add(int ndx, E value)
    {
        if(size== values.length)
        {
            alloc();
        }
        for(int i = size - 1; i >= ndx; i--)
            values[i+1] = values[i];

        values[ndx] = value;
        size++;
    }

    private void alloc()
    {
        E [] temp = (E[]) new Object[2*values.length];
        for(int i = 0; i < size; i++)
            temp[i] = values[i];

        values = temp;
    }

    public E get(int ndx)
    {
        return values[ndx];
    }

    public E set(int ndx, E value)
    {
        E result = values[ndx];
        values[ndx] = value;
        return result;
    }

    public E remove(int ndx)
    {
        E result = values[ndx];
        for(int i = ndx; i < size - 1;i++)
            values[i] = values[i+1];

        values[size] = null;
        size--;
        return result;
    }

    public void clear()
    {
        size = 0;
    }

    public boolean isEmpty()
    {

        return size==0;
    }

    public int indexOf (Object value)
    {

        for (int i = 0; i<size; i++){
            if (values[i].equals(value))
                return i;
        }

        return -1;

    }

    public boolean contains (Object value) {

        return indexOf(value) != -1;
    }

    public String toString()
    {

        String s = "|||";
        for(int i=0;i<size;i++)
        {
            s += values[i];
            if(i != size-1)
            {
                s+=" ";
            }
        }
        
        s = s + "|||" + "\n";
        return s;

    }

    public boolean equals(Object other)
    {
        List<E> localOther;

        if (!(other instanceof List)) {
            return false;

        } 

        else 
        {  
            localOther = (List<E>) other;                 

            if (localOther.size() == size) {

                for (int i=0; i<size;i++){

                    if (localOther.get(i) != values[i]) 
                    {   return false;}}

            } else return false;

        }

        return true;

    }

    public Iterator<E> iterator()
    {
        return new ArrayIterator(this);
    }

    public boolean hasDuplicate()
    {

        int x = 0;
        int y = 1;
        int limit;

        boolean result = false;

        Object tester1;
        Object tester2;

        limit = size()-1;

        for (int i=0; i<limit;i++)
        {
            for (int j=i+1;j<limit;j++)
            {

                tester1 = get(i);
                tester2 = get(j);

                System.out.println("tester1 is " + tester1 + " and tester2 is " + tester2);

                if (tester1.equals(tester2))
                {

                    result = true;
                } 

            }
        }

        return result;
    }

    public ListIterator<E> listIterator()
    {
        return new ArrayListIterator(this);

    }

    public ListIterator<E> listIterator(int ndx)
    {

        return new ArrayListIterator(this,ndx);

    }

}
