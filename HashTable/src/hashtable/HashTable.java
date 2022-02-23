/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hashtable;

/**
 *
 * @author mrsci
 */
public class HashTable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SeparateChainingHashTable myHT = new SeparateChainingHashTable();

        System.out.println("Adding 0 81 64 25 36 49 1 4 16 and 9");
        myHT.insert(0);
        myHT.insert(81);
        myHT.insert(64);
        myHT.insert(25);
        myHT.insert(36);
        myHT.insert(49);
        myHT.insert(1);
        myHT.insert(4);
        myHT.insert(16);
        myHT.insert(9);
        
        myHT.printHashTable();
        System.out.println();
        
        System.out.println("Is 81 included? : " + myHT.contains(81));
        System.out.println("Is 9 included? : " + myHT.contains(9));
        System.out.println("Is 15 included? : " + myHT.contains(15));
        System.out.println();
        
        System.out.println("Removing 36");
        myHT.remove(36);
        
        myHT.printHashTable();
        System.out.println();
        
        System.out.println("Removing 16");
        myHT.remove(16);
        
        myHT.printHashTable();
        System.out.println();
        
        System.out.println("Clearing the hash table");
        myHT.makeEmpty();
        
        myHT.printHashTable();
    }
    
}
