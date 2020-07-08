
/**
 * RunTime Class
 * @author singhva
 *
 */
 
import java.util.*;

public class RunTime {

	/**
	 * Main Method
	 * @param args
	 */
    public static void main(final String[] args) {
        executionTimeReport();
    }

    /**
     * Generates random array of size len
     * @param len
     * @return
     */
    public static int[] generateRandomArray (int len){
		int [] rarr = new int[len];
		Random rand = new Random();
		for (int c= 0; c< rarr.length; c++)
		{				
			rarr[c] = rand.nextInt(1000);
		}
		
	 return rarr;
	}
    
    private static int[] SAMPLE_SIZES = new int[] { 100, 1000, 5000, 10000, 50000, 100000 };
    /**
     * Method to execute time report
     */ 
    private static void executionTimeReport() {
    	 double [] insertionTime = new double[SAMPLE_SIZES.length];
    	 double [] quickTime = new double[SAMPLE_SIZES.length];
    	 double [] mergeTime = new double[SAMPLE_SIZES.length];
    	 
    	 long startTime;
    	 long endTime;
         
    	 System.out.println("Arrays size |  Selection  |   Insertion   |     Merge    |    Quick    |");
    	 System.out.print("========================================================================\n");
    	 
    	 for (int i =0; i< SAMPLE_SIZES.length;i++) {
        	int size = SAMPLE_SIZES[i]; 
            
            System.out.print(String.format("  %6d    |",size));

            int[] randomArray = generateRandomArray(size);
            startTime = System.currentTimeMillis();
    		Sorting.selectionSort(randomArray);
    		endTime = System.currentTimeMillis();

    		System.out.format("%7d      |", endTime- startTime);

    		randomArray = generateRandomArray(size);
            startTime = System.currentTimeMillis();
    		Sorting.insertionSort(randomArray);
    		endTime = System.currentTimeMillis();
 
    		
    		System.out.format("%7d        |", endTime- startTime);

    		randomArray = generateRandomArray(size);
            startTime = System.currentTimeMillis();
    		Sorting.mergeSort(randomArray);
    		endTime = System.currentTimeMillis();
    		
    		System.out.format("%7d       |", endTime- startTime);
    		    		
    		randomArray = generateRandomArray(size);
            startTime = System.currentTimeMillis();
    		Sorting.quickSort(randomArray);
    		endTime = System.currentTimeMillis();
    		
    		System.out.format("%7d      |\n", endTime- startTime);

        }
    	System.out.print("========================================================================\n");
     }

}



