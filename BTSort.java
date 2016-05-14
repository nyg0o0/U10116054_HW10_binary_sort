import java.util.*;

public class BTSort<E extends Comparable> {
	TreeNode root;
	int treeSize = 0;
	/** Create a default binary tree */
	public BTSort(){
	}
	
	/** Create a binary tree from an array of objects */
	public BTSort(E[] objects){
		for (int i = 0; i < objects.length; i++){
			if(i==0){
				
			}
			creatBT(objects[i]);
		}
	}

	
	/** A method to creat a binary tree from input objects */
	public void creatBT(E newObject) {
		
	}

	/** A method to sort the tree */
	public void sortBT(E newObject) {

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