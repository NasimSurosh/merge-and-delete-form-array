package important;

public class MergeSort {

	public static void merge(int[] number, int left, int mid, int right) {
		// Calculate the sizes of the two subarrays to be merged
		int n1 = mid - left + 1;
		int n2 = right - mid;

		// Create temporary arrays to hold the subarrays
		int[] leftArray = new int[n1];
		int[] rightArray = new int[n2];

		// Copy data to temporary arrays
		for (int i = 0; i < n1; i++)
			leftArray[i] = number[left + i];
		for (int i = 0; i < n2; i++)
			rightArray[i] = number[mid + 1 + i];

		// Merge the two subarrays back into the original array
		int i = 0; 
		int j = 0;
		int k = left;

		while (i < n1 && j < n2) {
			if (leftArray[i] <= rightArray[j]) {
				number[k] = leftArray[i];
				i++;
			} else {
				number[k] = rightArray[j];
				j++;
			}
			k++;
		}

		// Copy any remaining elements of the leftArray
		while (i < n1) {
			number[k] = leftArray[i];
			i++;
			k++;
		}

		// Copy any remaining elements of the rightArray
		while (j < n2) {
			number[k] = rightArray[j];
			j++;
			k++;
		}
	}

	public static void mergeSort(int[] number, int left, int right) {
		if (left < right) {
			// Find the middle point of the array
			int mid = left + (right - left) / 2;

			// Recursively sort the left and right halves
			mergeSort(number, left, mid);
			mergeSort(number, mid + 1, right);

			// Merge the sorted halves
			merge(number, left, mid, right);
		}
	}

	public static void main(String[] args) {
		int[] number = { 38, 27, 43, 5, 8, 82, 21, 43 };

		System.out.println("Array before sorting:");
		for (int num : number) {
			System.out.print(num + " ");
		}

		mergeSort(number, 0, number.length - 1);

		System.out.println("\n\n Array after sorted:");
		for (int num : number) {
			System.out.print(num + " ");
		}
	}
}
