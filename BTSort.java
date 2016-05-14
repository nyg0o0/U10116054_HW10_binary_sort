/* Import java api */
import java.util.*;

public class BTSort<E extends Comparable<E>> {
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
	
	/* Data fileds */
	TreeNode<E> root;
	
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
	public boolean creatBT(E e) {
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
				return false;
			// Create the new node and attach it to the parent node
			if (e.compareTo(parent.element) < 0)
				parent.left = createNewNode(e);
			else
				parent.right = createNewNode(e);
		}
		return true; // Element added
	}

	protected TreeNode<E> createNewNode(E e) {
		return new TreeNode<>(e);
	}

	
	/** Inorder traversal from the root */	
	public void inOrder() {
		inOrder(root);
	}

	/** A method to sort the tree */
	public void inOrder(TreeNode<E> root) {
		if (root != null){
			inOrder(root.left);
			System.out.print(root.element + " ");
			inOrder(root.right);
		}
	}

	/** Returns a path from the root leading to the specified element */
	public ArrayList<TreeNode<E>> path(E e) {
		ArrayList<TreeNode<E>> list = new ArrayList<>();
		TreeNode<E> current = root; // Start from the root

		while (current != null) {
		  list.add(current); // Add the node to the list
		  if (e.compareTo(current.element) < 0) {
			current = current.left;
		  }
		  else if (e.compareTo(current.element) > 0) {
			current = current.right;
		  }
		  else
			break;
		}

		return list; // Return an array list of nodes
	} 
}