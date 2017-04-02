package binarySearch;

public class LinearSearch {
	public static void main(String[] args) {
		int[] array = new int[50]; // Declare an array to search through
		
		for (int i = 0; i < array.length; i++) { // Loop through the array
			array[i] = i + 1; // Fill the array with the numbers 1 - 50
		}
		
		linearSearch(1, array);
		linearSearch(25, array); // Try a few examples
		linearSearch(50, array);
	}
	
	public static void linearSearch(int key, int[] array) {
		System.out.println("***Starting search for key: " + key + "***"); // Print start message
		
		for (int i = 0; i < array.length; i++) { // Loop through the array
			System.out.println("Comparing key " + key + " with " + array[i]); // Print comparisons
			
			if (key == array[i]) { // Compare key with current array position
				System.out.println("***Found key " + key + " after " + (i + 1) + " comparisons***\n"); // Print end message
				break; // Finish the search
			}
		}
	}
}
