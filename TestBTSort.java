/* Import java api*/
import java.util.*;

public class TestBTSort<E>{
	/* Main method */
	public static void main(String[] args) {
		/* Test array */
		Integer[] numbers = {-44, -5, -3, 3, 3, 1, -4, 0, 1, 2, 4, 5, 53};
		System.out.print("\nBefore Sorted: ");
		for(int i = 0; i<numbers.length ; i++){
			System.out.print(numbers[i] + " ");
		}
		 BTSort<Integer> intTree = new BTSort<>(numbers);
		System.out.print("\nAfter Sorted: ");
		intTree.inOrder();
	}	
}