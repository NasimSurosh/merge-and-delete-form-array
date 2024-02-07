package merge;

class MergeSort{
    public static void mergeSort(int[] number, int right, int middle, int left) {
        // claculate th size of aray
        int a = middle - left +1;
        int b = right - middle;

        //create temporary subarry
        int[] leftArray = new int[a];
        int[] rightArray = new int[b];

        // copy data temporary arry
        for(int i = 0; i < a ; i++)
            leftArray[i] = number[left +i];
        for (int i = 0; i< b; i++)
            rightArray[i] = number[middle + 1 + i];

        // merge to sub arrays
        int i= 0; int j= 0; int k = left;
        while (i < a && j < b) {
            if (leftArray[i] <= rightArray[j]) {
                number[k] = leftArray[i];
                i++;
            }
            else {
                number[k] = rightArray[j];
                j++;
            }
            k++;
        }
        // copy the element of right array and lift array

        while (j < b) {
            number[k] = rightArray[j];
            j++;
            k++;
        }
        while (i < a){
            number[k] = leftArray[i];
            i++;
            k++;
        }
    }

public static void merge (int[] number, int left, int right){
        if (left < right) {
            int middle = left + (right - left) /2;
            merge(number, left, middle);
            merge(number, middle +1 , right);

            mergeSort(number, right, middle, left);
        }
}
    public static void main(String[] args) {

        int[] number = {43,546 ,45,534 ,34, 37, 6534, 3, 4353, 342, 53, 345, 6326, 55342, 325};

        for (int num : number) {
            System.out.print(num + " ");
         
        }
           System.out.println();
        merge(number, 0, number.length - 1);
        for(int numb : number){
            System.out.print(numb + " ");
        }

    }

}

