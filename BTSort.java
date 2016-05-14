/* Import java api */
import java.util.*;

public class BTSort<E extends Comparable<E>> {
	/* Data fileds */
	TreeNode<E> root;
	protected int treeSize = 0;
	
	/** Create a default binary tree */
	public BTSort(){
	}
	
	/** Create a binary tree from an array of objects */
	public BTSort(E[] objects){
		for (int i = 0; i < objects.length; i++){
			creatBT(objects[i]);
		}
	}

	
	/** A method to creat a binary tree from input objects */
	public void creatBT(E e) {
		if ( root == null ){
			root = createNewNode(e); // Create a new root
		}
		else {
			// Locate the parent node
			TreeNode<E> parent = null;
			TreeNode<E> current = root;
			while (current != null)
			if (e.compareTo(current.element) < 0) {
				parent = current;
				current = current.left;
			}
			else if (e.compareTo(current.element) > 0) {
				parent = current;
				current = current.right;
			}
			else


			// Create the new node and attach it to the parent node
			if (e.compareTo(parent.element) < 0)
				parent.left = createNewNode(e);
			else
				parent.right = createNewNode(e);
		}
		treeSize++;
	}

	protected TreeNode<E> createNewNode(E e) {
		return new TreeNode<>(e);
	}
	public int getTreeSize() {
		return treeSize;
	}

	/** A method to sort the tree */
	public void sortBT(TreeNode<E> root) {

	}


	
	/** Inorder traversal from a subtree */
	protected void inorder(TreeNode<E> root) {
		if (root != null){
			inorder(root.left);
			System.out.print(root.element + " ");
			inorder(root.right);
		}
	}
	
	/** This inner class is static, because it does not access 
      any instance members defined in its outer class */
	public static class TreeNode<E extends Comparable<E>> {
		public E element;
		public TreeNode<E> left;
		public TreeNode<E> right;

		public TreeNode(E e) {
		  element = e;
		}
    }
}