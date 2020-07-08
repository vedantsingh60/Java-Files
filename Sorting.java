import java.util.Arrays;

/**
 * Sorting Class
 * @author singhva
 *
 */
public class Sorting {
	    /**
	     * Implements the SelectionSort Algorithm
	     * @param array array to be worked upon
	     */
        public static void selectionSort(int[] array) {

        for(int i = 0; i < array.length - 1; i++) {
        	int minIndex = i;
        	for(int j = i + 1; j < array.length; j++) {
        		if(array[j] < array[minIndex]) {
        		minIndex = j;
        		}
        	}
        	if(minIndex != i) {
        		swap(array, minIndex, i);
        	}
          }
        }
        /**
         * Implements the insertion sort algorithm
         * @param array array to be worked upon
         */
	    public static void insertionSort(int[] array) {
	    	for (int i = 1; i < array.length;i++){
	    	int next =array[i];
	    	int j = i;
	    	while (j > 0 && array[j - 1] > next)
	    	{
	    		array[j] = array[j - 1];  
	    		j--;
	    	}
	    	array[j] =next;
	    	}
	    }         
	    /**
         * Calls the quick sort algorithm
         * @param array array to be worked upon
         */
	    public static void quickSort(int[] array) {
	    
	    	quickSort(array, 0, array.length - 1);
	        
	    }

	    /**
	     * Implements the quicksort algorithm
	     * @param array input array
	     * @param begin beginning position
	     * @param end ending position
	     */
	    private static void quickSort(int[] array, int begin, int end) {

	    	if(begin < end+1) {
	    		int p = partition(array, begin, end);
	    		quickSort(array, begin, p-1);
	    		quickSort(array, p+1, end);
	    	}
	    
	    }
	    /**
	     * Partitions the array for quick sort
	     * @param array array to be worked upon
	     * @param begin begin position
	     * @param end end position
	     * @return returns the array
	     */
	    private static int partition(int[] array, int begin, int end) {
	     
	    	int pivot = array[begin];
	        int i = begin + 1;
	        
	        for (int j = begin + 1; j <= end; j++) {
		        	if(array[j] < pivot) {
		        		swap(array, i ,j);
		        		i++;
		        	}
	        }
		      swap(array, begin, i-1);
		      return i -1;
	    }
	        

	    private static void swap(int[] array, int i, int j) {
	        int x = array[i];
	        array[i] = array[j];
	        array[j] = x;
	    }
/**
 * Implements the merge sort algorithm
 * @param array array to be worked upon
 * @return returns the sorted array
 */
	    public static int[] mergeSort(int[] array) {
	    	if (array.length <= 1) 
	    		return array;
	    	int[] left = Arrays.copyOfRange(array, 0, array.length/2);
	    	int[] right = Arrays.copyOfRange(array, array.length/2, array.length); 
	    	
	    	if(left.length!=1) {
	    		left = mergeSort(left);
	    	}
	    	if(right.length!=1) {
	    		right = mergeSort(right);
	    	}
	    	
	    	
	    	 merge(array, left, right);
	    	 return array;
	    }
	/**
	 * Merges two sorted arrays to one
	 * @param result result to be stored in
	 * @param left left array
	 * @param right right array
	 * @return returns the result
	 */
	    private static int[] merge(int[] result, int[] left, int[] right) {
	   
	    	int lp = 0;
	    	int rp = 0;
	    	
	    	for (int resultp = 0; resultp < result.length; resultp++) {
	    		if(rp >= right.length || (lp<left.length && left[lp]<=right[rp]))
	    		{
	    			result[resultp] = left[lp];
	    			lp++;
	    		}
	    		else
	    		{
	    		result[resultp] = right[rp];
	    		rp++;
	    		}
	    	}
	    	
	    	return result;
	    }
	   
	    public static void main(String[] args) {
	    	int[] data = {-2, 45, 0, 121, -9 };
	    	System.out.println("Unsorted: "+ Arrays.toString(data));
		    selectionSort(data);
	        insertionSort(data);
		    quickSort(data);
		    mergeSort(data);
		    System.out.println("sorted: "+ Arrays.toString(data));
	   	}
}

