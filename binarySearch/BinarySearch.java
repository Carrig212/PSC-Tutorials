package binarySearch;

public class BinarySearch {
	public static void main(String[] args) {
		int[] array = new int[50]; // Declare an array to search through
		
		for (int i = 0; i < array.length; i++) { // Loop through the array
			array[i] = i + 1; // Fill the array with the numbers 1 - 50
		}
		
		binarySearch(1, array);
		binarySearch(25, array); // Try a few examples
		binarySearch(50, array);
	}

	private static void binarySearch(int key, int[] array) {
		int count = 0; // For counting the number of comparisons
		int left = 0; // Left partition index
		int right = array.length - 1; // Right partition index
		int mid; // Middle of the partition
		boolean found = false; // For breaking the loop
		
		System.out.println("***Starting search for key: " + key + "***"); // Print start message

		while (!found) {
			mid = left + (right - left) / 2; // Set the middle index
			count++; // Count the number of comparisons
			
			System.out.println("Comparing key " + key + " with " + array[mid]); // Print comparisons
			
			if (array[mid] == key) { // Check the current mid
				System.out.println("***Found key " + key + " after " + count + " comparisons***\n"); // Print end message
				found = true; // Break the search
			} else {
				if (key > array[mid]) {
					left = mid + 1; // Set the left to be right of the old mid if the key is bigger
				} else {
					right = mid - 1; // Otherwise set the right to be left of the old mid
				}
			}
		}
	}
	
	
}
