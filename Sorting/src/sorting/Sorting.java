/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorting;

/**
 *
 * @author hp
 */
class Sorting {
    //******************** Selection Sort *************************
    
    public static void selectionSort(int[] a)
    {
        int hold,min_index;

        for(int i=0; i<a.length-1; i++)
        {
            min_index = i;

            for(int j=i+1; j<a.length; j++)
            {
                if(a[j] < a[min_index])
                    min_index = j;
            }

            hold = a[i];
            a[i] = a[min_index];
            a[min_index] = hold;
        }
    }
    
    
    //******************** Bubble Sort *************************
    
    public static void bubbleSort1(int[] a)
    {
        int hold;

        for(int pass=0; pass<a.length-1; pass++)
        {
            for(int i=0; i<a.length-1; i++)
            {
                if(a[i] > a[i+1])
                {
                    hold = a[i];
                    a[i] = a[i+1];
                    a[i+1] = hold;
                }
            }
        }
    }
    
    public static void bubbleSort2(int[] a)
    {
        int hold;
        boolean swapped;

        for(int pass=0; pass<a.length-1; pass++)
        {
            swapped = false;
            for(int i=0; i<a.length-1; i++)
            {
                if(a[i] > a[i+1])
                {
                    hold = a[i];
                    a[i] = a[i+1];
                    a[i+1] = hold;
                    
                    swapped = true;
                }
            }
            
            if(swapped == false)
                break;
        }
    }
    
    
    //******************** Insertion Sort *************************
    
    public static void insertionSort(int[] a)
    {
        int insert; 
        int moveItem;
        
        for(int next=1; next<a.length; next++)
        {
            insert = a[next];           
            moveItem = next;
            
            while(moveItem > 0 && insert < a[moveItem-1])
            {
                a[moveItem] = a[moveItem-1]; 
                moveItem--;
            }
            
            a[moveItem] = insert;
        }
    }
 
    //******************** Shell Sort *************************
    
    public static void shellSort(int[] a)
    {
        int insert;
        int moveItem;
        
        for(int gap=a.length/2; gap>0; gap/=2)
        {
            for(int next=gap; next<a.length; next++) 
            {
                insert = a[next];
                moveItem = next;
                
                while(moveItem >= gap && insert < a[moveItem-gap])
                {
                    a[moveItem] = a[moveItem-gap];
                    moveItem -= gap;
                }
                
                a[moveItem] = insert;
            }
        }
    }  
}
