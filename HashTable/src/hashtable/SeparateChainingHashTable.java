/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hashtable;

import java.util.LinkedList;

/**
 *
 * @author hp
 */
class SeparateChainingHashTable {
   
    private static final int DEFAULT_TABLE_SIZE = 10;

    private LinkedList<Integer>[] theLists; 
    
    public SeparateChainingHashTable()
    {
        theLists = new LinkedList[DEFAULT_TABLE_SIZE];
        
        for(int i=0; i<theLists.length; i++)     
            theLists[i] = new LinkedList<>();    
    }

    public void insert(Integer x)
    {
        LinkedList<Integer> whichList = theLists[myHash(x)];
        
        if(!whichList.contains(x))      
            whichList.add(x);           
    }

    public void remove(Integer x)
    {
        LinkedList<Integer> whichList = theLists[myHash(x)];
        
        if(whichList.contains(x))       
            whichList.remove(x);        
    }

    public boolean contains(Integer x)
    {
        LinkedList<Integer> whichList = theLists[myHash(x)];
		
        return whichList.contains(x);    
    }

    public void makeEmpty()
    {
        for(int i=0; i<theLists.length; i++)   
            theLists[i].clear();               
    }
    
    public void printHashTable()
    {
        LinkedList<Integer> whichList;
        
        for(int i=0; i<theLists.length; i++)
        {
            whichList = theLists[i];
			
            System.out.print("|" + i + "|" + " --> ");            
            
            for(int j=0; j<whichList.size(); j++)                                                                  
                System.out.print(whichList.get(j) + " --> ");     
            
            System.out.println();                                
        }
    }

    private int myHash(Integer x)
    {
        return (x % theLists.length);    
    }
} 

