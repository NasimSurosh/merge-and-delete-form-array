package important;

import java.util.Arrays;

public class MergeTwoArrays {
	
	public static void main(String[] args) {

	     int[] number = {2,4,6,8};
	     int[] number1 = {2,6,10};

	     int i = 0;
	     
	    int[] result =new int[number.length + number1.length];
	    
	    for (int merge : number) {
	    	result[i++] = merge;
	    }
	    for (int merge : number1) {
	    	result[i++] = merge;
	    }
	    
	    System.out.println(Arrays.toString(result));
	    }
	
	}



