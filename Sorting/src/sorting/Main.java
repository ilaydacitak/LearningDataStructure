/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorting;

import java.util.Arrays;

/**
 *
 * @author hp
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("***************** Selection Sort ***************************");
        
        int[] myArray_1 = {9, 2, 5, 10, 1, 4, 6, 3, 8, 7};
		
        System.out.println("Before sorting myArray_1  : " + Arrays.toString(myArray_1));

        Sorting.selectionSort(myArray_1);

        System.out.println("After sorting myArray_1   : "  + Arrays.toString(myArray_1));
        
       
        System.out.println("*******************Bubble Sort 1****************************");
        
        int[] myArray_2_1 = {9, 2, 5, 10, 1, 4, 6, 3, 8, 7};
		
        System.out.println("Before sorting myArray_2_1: " + Arrays.toString(myArray_2_1));

        Sorting.bubbleSort1(myArray_2_1);

        System.out.println("After sorting myArray_2_1 : "  + Arrays.toString(myArray_2_1));
        
        System.out.println("*******************Bubble Sort 2****************************");
        
        int[] myArray_2_2 = {9, 2, 5, 10, 1, 4, 6, 3, 8, 7};
		
        System.out.println("Before sorting myArray_2_2: " + Arrays.toString(myArray_2_2));

        Sorting.bubbleSort2(myArray_2_2);

        System.out.println("After sorting myArray_2_2 : "  + Arrays.toString(myArray_2_2));
        
        
        System.out.println("***************** Insertion Sort ***************************");
        
        int[] myArray_3 = {9, 2, 5, 10, 1, 4, 6, 3, 8, 7};
		
        System.out.println("Before sorting myArray_3  : " + Arrays.toString(myArray_3));

        Sorting.insertionSort(myArray_3);

        System.out.println("After sorting myArray_3   : "  + Arrays.toString(myArray_3));
        
        
        System.out.println("***************** Shell Sort ***************************");
        
        int[] myArray_4 = {9, 2, 5, 10, 1, 4, 6, 3, 8, 7};
		
        System.out.println("Before sorting myArray_4  : " + Arrays.toString(myArray_4));

        Sorting.shellSort(myArray_4);

        System.out.println("After sorting myArray_4   : "  + Arrays.toString(myArray_4));
        
    }
    
}
