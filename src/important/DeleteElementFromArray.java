package important;

import java.util.Scanner;

public class DeleteElementFromArray {

	public static void main(String[] args) {
		
		int[] array = new int[5];
		
		int location = 0;
		int max = 4;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter 5 element from enteger");
		for (int i = 0; i <= max; i++) {
			array[i] = scan.nextInt();
		}
		System.out.println("value in array are following; ");
		
		for (int i = 0; i <= max; i++) {
			System.out.println(array[i]);
		}
		System.out.println("\nEnter the location from where u want to delete value: ");
		location = scan.nextInt();
		
		for (int i = location; i <= max; i++) {
			array[i] = array[i + 1];
			
		}
		System.out.println("after deleting " + location);
		for (int i = 0; i < max; i++) {
			System.out.println(array[i]);
		}
		

	}

}
