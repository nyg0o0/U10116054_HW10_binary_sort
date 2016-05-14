/**
	Student ID: U10116054
	Student Name: YU-HSIN, CHEN
	This is a program to sort numbers with binary tree.
	P.S: This program refer to the textbook. Chapter25. BST and TestBST.java
*/


/** Import java api*/
import java.util.*;

/** Test program */
public class TestBTSort<E>{
	/** Main method */
	public static void main(String[] args) {
		/** Test array */
		System.out.print("This is a program to sort numbers with binary tree.");
		Integer[] numbers = {-1, -5, -3, 3, -4, 0, 1, 2, 4, 75, 53};
		
		// Display the arry before sorted
		System.out.print("\nBefore Sorted: ");
		for(int i = 0; i<numbers.length ; i++){
			System.out.print(numbers[i] + "  ");
		}
		
		// Display the arry after sorted
		BTSort<Integer> intTree = new BTSort<>(numbers);
		System.out.print("\nAfter Sorted: ");
		intTree.inOrder();
	}	
}