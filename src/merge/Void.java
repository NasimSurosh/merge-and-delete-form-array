package merge;

public class Void {

	public static void main(String[] args) {
		
	

		int simple[] = {543,34,525,65,17,889,19,5,4,3,-7,89,9,56,78765,573,378,7,90};
		//int size = simple.length;
		int k;
		for (int i = 0; i< simple.length; i++) {
			System.out.print(simple[i]+ " ");
			}
			System.out.println();	
		
		
		for (int i = 1; i < simple.length; i++)
			for(int j = simple.length-1; j >= i; j--) {
				if (simple[j-1] > simple[j]) {
					k = simple[j -1];
					simple [j -1] = simple[j];
					simple[j] = k;
				}
			}
		for (int number: simple) {
			System.out.print(number+ " ");
		}
	
		
		
	}

}
