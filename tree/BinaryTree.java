package tree; 
import list.*;

/**
 * version 10/16/2014.
 * author Gianluca Bastia.
 * 
 * A Binary Tree has a value and two children, each of which is a binary tree.
 * They can be empty.
 * 
 * 
 * Tree Traversal
 * 
 * PreOrder
 * 1)Visit the root value
 * 2)visit all values in left child
 * 3)visit all values in right child
 * 
 * InOrder
 * 1)Visit all values in left child
 * 2)visit root
 * 3)visit all values in right child
 * 
 * PostOrder
 * 1)visit all values in left child
 * 2)visit all values in right child
 * 3)visit all values in root
 * 
 * 
 */
public interface BinaryTree<E>{

    /**
     * @return the left child.
     */
    BinaryTree<E> getLeft();

    /**
     * @return the right child.
     */
    BinaryTree<E> getRight();

    /**
     *@return the value of binary child. 
     */
    E getValue();

    /**
     * Change value in left child on this BinaryTree.
     */
    void setLeft(BinaryTree<E> left);

    /**
     * Change value in right child on this BinaryTree.
     */
    void setRight(BinaryTree<E> right);

    /**
     * Change value of the BinaryTree.
     */
    void setValue(E value);

    /**
     * Add the given value to this BinaryTree
     * @return A reference to The Resulting BinaryTree
     */
    BinaryTree<E> add(E value);

    /**
     * @return true only if the given value is found in this BinaryTree
     */
    boolean containsKey(E value);

    /**
     * Search for the given value
     * @return reference to value found or null if not found
     */
    E get(E value);

    /**
     *Remove the given Object from this BinaryTree
     *@return the resulting Tree
     */
    BinaryTree<E> remove(Object obj);

    /**
     * @return Iterator for this BinaryTree
     */
    Iterator<E> iterator();

    /**
     * @return This BinaryTree as a string
     */
    String toString();

    boolean isEmpty();

    /** @return true only if this BinaryTree is equal to the given obj */

    boolean equals (Object obj);
}