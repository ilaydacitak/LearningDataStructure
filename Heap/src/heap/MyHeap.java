/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heap;

/**
 *
 * @author hp
 */
class MyHeap {
    private int[] heapArray;
    private int size;

    public MyHeap()
    {
        heapArray = new int[1000];
        size = 0;
    }

    public int size()
    {
        return size;
    }

    public boolean isEmpty()
    {
        return (size == 0);
    }

    public int min() throws EmptyHeapException 
    {
        if(isEmpty())
            throw new EmptyHeapException("Heap is empty");
        else
            return heapArray[1];
    }

    public void insert(int newElement)
    {
        size++;
        heapArray[size] = newElement;
        upHeap();
    }

    private void upHeap()
    {
        int index = size;
        int parent,temp;

        while(true)
        {
            parent = index / 2;
            if(parent > 0)
            {
                if(heapArray[index] < heapArray[parent])
                {
                    temp = heapArray[parent];
                    heapArray[parent] = heapArray[index];
                    heapArray[index] = temp;
                    
                    index = parent;
                }
                else
                    break;
            }
            else
                break;
        }
    }

    public int deleteMin() throws EmptyHeapException 
    {
        if(isEmpty())
            throw new EmptyHeapException("Heap is empty");
        else
        {
            int min = heapArray[1];

            heapArray[1] = heapArray[size];
            
            size--;
            
            if(size > 1)
                downHeap();
            
            return min;
        }				
    }

    private void downHeap()
    {
        int index = 1;
        int leftChildIndex,rightChildIndex,temp;

        while(true)
        {
            leftChildIndex = index * 2;
            rightChildIndex = (index * 2) + 1;

            if(leftChildIndex > size && rightChildIndex > size) //there is no child
                break;
            else if(rightChildIndex > size) //there is only left child
            {
                if(heapArray[index] > heapArray[leftChildIndex]) //swap
                {
                        temp = heapArray[index];
                        heapArray[index] = heapArray[leftChildIndex]; 
                        heapArray[leftChildIndex] = temp;
                        
                        index = leftChildIndex;
                }
                else
                    break;
            }
            else //there are two children
            {
                if(heapArray[leftChildIndex] <= heapArray[rightChildIndex]) //swap with left
                {
                    if(heapArray[index] > heapArray[leftChildIndex]) //swap
                    {
                        temp = heapArray[index];
                        heapArray[index] = heapArray[leftChildIndex]; 
                        heapArray[leftChildIndex] = temp;
                        
                        index = leftChildIndex;
                    }
                    else
                        break;
                }
                else //swap with right
                {
                    if(heapArray[index] > heapArray[rightChildIndex]) //swap
                    {
                        temp = heapArray[index];
                        heapArray[index] = heapArray[rightChildIndex]; 
                        heapArray[rightChildIndex] = temp;
                        
                        index = rightChildIndex;
                    }
                    else
                        break;
                }
            }
        }
    }

    public void printHeap()
    {
        for(int i=1; i<=size; i++) 
        {
            System.out.print(heapArray[i]);
            if(i != size) //if it is not last element
                System.out.print(" - ");
        }
    }
}
