/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heapmergequick;

/**
 *
 * @author hp
 */
class Sorting {
    
    //******************** Heap Sort **************************
    
    public static void heapSort(int[] a) throws EmptyHeapException
    {
        MyHeap mh = new MyHeap();
		
        for(int i=0; i<a.length; i++)
            mh.insert(a[i]);
        
        for(int i=0; i<a.length; i++)
            a[i] = mh.deleteMin();
    }
    
    //******************** Merge Sort *************************
    
    public static void mergeSort(int[] a)
    {
        int[] tmpArray = new int[a.length];

        mergeSort( a, tmpArray, 0, a.length - 1 );
    }
    
    private static void mergeSort(int[] a, int[] tmpArray, int left, int right)
    {
        if( left < right )
        {
            int center = ( left + right ) / 2;
            mergeSort( a, tmpArray, left, center );
            mergeSort( a, tmpArray, center + 1, right );
            merge( a, tmpArray, left, center + 1, right );
        }
    }
    
    private static void merge(int[] a, int[] tmpArray, int leftPos, int rightPos, int rightEnd )
    {
        int leftEnd = rightPos - 1;
        int tmpPos = leftPos;
        int numElements = rightEnd - leftPos + 1;

        // Main loop
        while( leftPos <= leftEnd && rightPos <= rightEnd )
            if( a[ leftPos ] <= a[ rightPos ] )
                tmpArray[ tmpPos++ ] = a[ leftPos++ ];
            else
                tmpArray[ tmpPos++ ] = a[ rightPos++ ];

        while( leftPos <= leftEnd )    // Copy rest of first half
            tmpArray[ tmpPos++ ] = a[ leftPos++ ];

        while( rightPos <= rightEnd )  // Copy rest of right half
            tmpArray[ tmpPos++ ] = a[ rightPos++ ];

        // Copy tmpArray back
        for( int i = 0; i < numElements; i++, rightEnd-- )
            a[ rightEnd ] = tmpArray[ rightEnd ];
    }  
    
    //******************** Quick Sort *************************
    
    public static void quickSort(int[] a)
    {
        quickSort(a, 0, a.length - 1);
    }
    
    private static void quickSort(int[] a, int left, int right)
    {
        int temp;
        int i = left;
        int j = right-1;
        int pivot = a[right];

        do
        {
			while( a[i] < pivot && i < right )
				i++;

			while( a[j] > pivot && j > left)
				j--;

			if( i < j )
			{
				temp = a[i];
				a[i] = a[j];
				a[j] = temp;
				i++;
				j--;
			}
        }
        while( i < j );

        temp = a[i];
        a[i] = a[right];
        a[right] = temp;

        if(left < j)
			quickSort(a, left, j);
        if(i < right)
			quickSort(a, i, right);	
    }
}
