/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arraylist;

/**
 *
 * @author mrsci
 */
public class ArrayList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MyArrayList<Integer> lst = new MyArrayList<>();
        
        System.out.println("Array List : " +  lst );
        System.out.println("The size of the array list is : " + lst.size());  
        System.out.println("Is array list empty : " + lst.isEmpty());

        for(int i=0; i<10; i++)
            lst.add(i);
        
        System.out.println("Array List : " +  lst ); 
        System.out.println("The size of the array list is : " + lst.size());
        System.out.println("Is array list empty : " + lst.isEmpty());
        
        lst.add(5, 10);
        
        System.out.println("Array List : " +  lst );
        System.out.println("The size of the array list is : " + lst.size());
        
        int value = lst.get(8);
        
        System.out.println("The value at index 8 is : " + value);
        System.out.println("The size of the array list is : " + lst.size());
        System.out.println("Array List : " +  lst );
        
        lst.set(9,11);
        
        System.out.println("The size of the array list is : " + lst.size());
        System.out.println("Array List : " +  lst );
        
        lst.remove(4);
        
        System.out.println("The size of the array list is : " + lst.size());
        System.out.println("Array List : " +  lst ); 
        
        lst.clear();
        
        System.out.println("Array List : " +  lst );
        System.out.println("The size of the array list is : " + lst.size());  
        System.out.println("Is array list empty : " + lst.isEmpty());
    }
    
}
