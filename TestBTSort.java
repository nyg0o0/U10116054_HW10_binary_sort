/* Import java api*/
import java.util.*;

public class TestBTSort<E>{
	/* Main method */
	public static void main(String[] args) {
		/* Test array */
		Integer[] numbers = {-44, -5, -3, 3, 3, 1, -4, 0, 1, 2, 4, 5, 53};
		 BTSort<Integer> intTree = new BTSort<>(numbers);
		System.out.print("\nAfter Sorted: ");
		intTree.inOrder();
	}	
}