/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package heapmergequick;

import java.util.Arrays;

/**
 *
 * @author mrsci
 */
public class HeapMergeQuick {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws EmptyHeapException {
        System.out.println("***************** Heap Sort ***************************");
        
        int[] myArray_1 = {9, 2, 5, 10, 1, 4, 6, 3, 8, 7};
		
        System.out.println("Before sorting myArray_1  : " + Arrays.toString(myArray_1));

        Sorting.heapSort(myArray_1);

        System.out.println("After sorting myArray_1   : "  + Arrays.toString(myArray_1));
        	
        
        System.out.println("***************** Merge Sort ***************************");
        
        int[] myArray_2 = {9, 2, 5, 10, 1, 4, 6, 3, 8, 7};
		
        System.out.println("Before sorting myArray_2  : " + Arrays.toString(myArray_2));

        Sorting.mergeSort(myArray_2);

        System.out.println("After sorting myArray_2   : "  + Arrays.toString(myArray_2));
        
        
        System.out.println("***************** Quick Sort ***************************");
        
        int[] myArray_3 = {9, 2, 5, 10, 1, 4, 6, 3, 8, 7};
		
        System.out.println("Before sorting myArray_3  : " + Arrays.toString(myArray_3));

        Sorting.quickSort(myArray_3);

        System.out.println("After sorting myArray_3   : "  + Arrays.toString(myArray_3));
    }
    
}
