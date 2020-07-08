import java.util.Arrays;


public class Sorting {
	    /** Sorting algorithms **/
	    
	    // Selectionsort.
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
	    // Insertion sort.
	    public static void insertionSort(int[] array) {
	       // throw new UnsupportedOperationException();
	    	for (int i = 1; i < array.length;i++){
	    	int next =array[i];
	    	// Move all larger elements up  
	    	int j = i;
	    	while (j > 0 && array[j - 1] > next)
	    	{
	    		array[j] = array[j - 1];  
	    		j--;
	    	}
	    	// Insert the element 
	    	array[j] =next;
	    	}
	    }         
	    
	    
	    // Quicksort.
	    public static void quickSort(int[] array) {
	    
	    	quickSort(array, 0, array.length - 1);
	        
	    }

	    // Quicksort part of an array
	    private static void quickSort(int[] array, int begin, int end) {

	    	if(begin < end+1) {
	    		int p = partition(array, begin, end);
	    		quickSort(array, begn, p-1);
	    		quickSort(array, p+1, end);
	    	}
	    
	    }

	    // Partition part of an array, and return the index where the pivot
	    // ended up.
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
	        

	    // Swap two elements in an array
	    private static void swap(int[] array, int i, int j) {
	        int x = array[i];
	        array[i] = array[j];
	        array[j] = x;
	    }

	    // Mergesort.

	    public static int[] mergeSort(int[] array) {
	    	if (array.length <= 1) // base case
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
	
    // Merge two sorted arrays into one
	    private static int[] merge(int[] result, int[] left, int[] right) {
	   // 	int[] result = new int[left.length + right.length];
	    	
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
	    
	   // use this main function to try you sorting over a simple example
	    int[] data = {-2, 45, 0, 11, -9 };
	    
	    System.out.println("Unsorted: "+ Arrays.toString(data));
	   // selectionSort(data);
           // insertionSort(data);
	   // quickSort(data);
	   // mergeSort(data);
	   // sort the array using your implemented algorithm. 
	   // call the sort here. 
	    System.out.println("sorted: "+ Arrays.toString(data));
	    
	}
}

