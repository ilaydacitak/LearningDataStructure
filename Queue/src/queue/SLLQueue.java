/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queue;

/**
 *
 * @author hp
 */
class SLLQueue<AnyType> {
    private Node<AnyType> head;
    private Node<AnyType> tail;
    private int theSize;
    
    public AnyType front()
    {
        if (theSize == 0) 
            throw new RuntimeException("Queue is empty!");
            
        return head.getData(); 
    }
    
    public void enqueue(AnyType newData) 
    {
        Node<AnyType> newNode = new Node<>();
        
        newNode.setData(newData);    
        
        if (theSize == 0)            
          head = newNode;            
        else                         
          tail.setNext(newNode);     
        
        tail = newNode;              
        
        theSize++;
    }
    
    public AnyType dequeue()
    {
        if (theSize == 0) 
            throw new RuntimeException("Queue is empty!");
        
        AnyType returnValue = head.getData();  
        head = head.getNext();        
        theSize--;                    
      
        return returnValue;
    }
    
    public int size() 
    { 
        return theSize;
    }
    
    public boolean isEmpty() 
    {
        return theSize == 0;
    }
    
    @Override
    public String toString() 
    {
        String rStr = "[";
        
	Node<AnyType> temp = head;
        for (int i = 0; i < theSize; i++)
        {
            if(i==0)                                 
                rStr = rStr + temp.getData();         
            else                                      
                rStr = rStr + "," + temp.getData();   
            
            temp = temp.getNext();                    
        }
        rStr = rStr + "]";
        
        return rStr;
}
}

