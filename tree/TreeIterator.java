package tree;
import list.Iterator;
import queue.*;

/**
 * Write a description of class asdk here.
 * 
 * @author Peter Singley
 * @version 102314
 * 
 * 
 */
public class TreeIterator<E extends Comparable> implements Iterator<E>
{

    BinaryTree<E> tree;
    QueueADT<E> q;
    E last; //last value obtained by next.

    TreeIterator(BinaryTree<E> tree)
    {
        q = new Queue();
        this.tree = tree;
        buildQ(tree);
         
    }

    private void buildQ(BinaryTree<E> tree)
    {
        q.add(tree.getValue()); //PreOrder traversal
        if(tree.getLeft() instanceof BinarySearchTree)
            buildQ(tree.getLeft());

        //q.add(tree.getValue()); //InOrder traversal 

        if(tree.getRight() instanceof BinarySearchTree)
            buildQ(tree.getRight());
        //q.add(tree.getValue()); //PostOrder traversal 

    }

    public boolean hasNext()
    {return !(q.isEmpty());}

    public E next()
    {
        last = q.remove();
        return last;
        
    }

    public void remove()
    {
        if(last.equals(tree.getValue())){
            BinaryTree<E> temp = tree.remove(last);
            tree.setValue(temp.getValue());
            tree.setLeft(temp.getLeft());
            tree.setRight(temp.getRight());
        }
        
        else tree = tree.remove(last);
    }

    

}
