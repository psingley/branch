package tree;
import list.*;

/**
 * A BinaryTree in which the value of all BinaryTrees to the left are smaller,
 *  the value of all BinaryTrees to the right are larger.
 */
public class BinarySearchTree<E extends Comparable> implements BinaryTree<E> {
    BinaryTree<E> left = new EmptyBinarySearchTree<E> ();
    BinaryTree<E> right = new EmptyBinarySearchTree<E> ();
    E value;

    public BinarySearchTree(E value){
        this.value = value;
    }

    public BinaryTree<E> getLeft(){
        return left;
    }

    public BinaryTree<E> getRight(){
        return right;
    }

    public E getValue(){
        return value;
    }

    public void setLeft(BinaryTree<E> left){
        this.left = left;
    }

    public void setRight(BinaryTree<E> right){
        this.right = right;
    }

    public void setValue(E value){
        this.value = value;
    }

    public BinaryTree<E> add(E value){
        int cmp = this.value.compareTo(value);

        if (cmp < 0){
            left = left.add(value);
        }
        else if (cmp > 0){
            right = right.add(value);
        }

        return this;
    }

    public boolean containsKey(E value){
        int cmp = this.value.compareTo(value);

        if (cmp == 0){
            return true;
        }

        else if(cmp < 0){
            return left.containsKey(value);
        }

        return right.containsKey(value);
    }

    public BinaryTree<E> remove(Object obj){
        return null;
    }

    public E get(E value){
        return null;
    }

    public Iterator<E> iterator(){
        return null;
    }

    public String toString(){
        return null;
    }
    
    public boolean isEmpty()
    {
        return false;
    }
    
    public boolean equals(Object obj)
    {

        BinarySearchTree<E> localOther;
        
        if(obj instanceof BinarySearchTree)
        {
            localOther = (BinarySearchTree<E>) obj;
            if(value.equals(localOther.getValue()))
            {
                if(this.getRight().equals(localOther.getRight()) && (this.getLeft().equals(localOther.getLeft())))
                return true;
                
            }
            
        } 
        
        return false;
        
    }
}