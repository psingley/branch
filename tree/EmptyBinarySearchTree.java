package tree;
import list.*;

public class EmptyBinarySearchTree<E extends Comparable> implements BinaryTree<E> {
    //These should not be called

    public BinaryTree<E> getLeft(){
        return null;
    }

    public BinaryTree<E> getRight(){
        return null;
    }

    public E getValue(){
        return null;
    }

    public void setLeft(BinaryTree<E> left)
    {}

    public void setRight(BinaryTree<E> right)
    {}

    public void setValue(E value)
    {}

    public BinaryTree<E> add(E value){
        return new BinarySearchTree(value);
    }

    public boolean containsKey(E value){
        return false;
    }

    public E get(E value){
        return null;
    }

    public BinaryTree<E> remove(Object obj){
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

        return true;

    }

    public boolean equals(Object obj)
    {
        return (obj instanceof EmptyBinarySearchTree);
    }
}
