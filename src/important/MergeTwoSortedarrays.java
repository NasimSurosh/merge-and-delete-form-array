package important;

public class MergeTwoSortedarrays {
	  public int[] merge(int[] nums1, int[] nums2, int m, int n) {
	      
		  int[] result = new int[m+n];

	        int i = 0;
	        int j = 0;
	        int k = 0;

	        while (i < m && j < n) {
	            if (nums1[i] < nums2[j]) {
	                result[k] = nums1[i];
	                i++;
	            }
	            else{
	                result[k] = nums2[j];
	                j++;
	            }
	            k++;
	        }
	        while(i < m) {
	            result[k] = nums1[i];
	            i++;
	            k++;
	        }
	        while (j < n) {
	            result[k] = nums2[j];
	            j++;
	            k++;
	        }
	        return result;
	    }
	        public void print(int[] arr){
	            int newArray = arr.length;
	            for (int i =  0; i < newArray; i++){
	                System.out.print(arr[i] + " ");

	        }
	            System.out.println();

	    }

	    public static void main(String[] args) {


	    	MergeTwoSortedarrays solution = new MergeTwoSortedarrays();
	        int[] nums1 = {2,4,7,9, 15};
	        int[] nums2 = {7,12,45,89};
	        solution.print(nums1);
	        solution.print(nums2);

	        int[] result = solution.merge(nums1, nums2, nums1.length,nums2.length);
	        solution.print(result);

	    }

	}


