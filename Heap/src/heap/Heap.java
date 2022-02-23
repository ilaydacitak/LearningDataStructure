/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package heap;

/**
 *
 * @author mrsci
 */
public class Heap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MyHeap mh = new MyHeap();
		
        mh.insert(13);
        mh.insert(21);
        mh.insert(16);
        mh.insert(24);
        mh.insert(31);
        mh.insert(19);
        mh.insert(68);
        mh.insert(65);
        mh.insert(26);
        mh.insert(32);

        System.out.println("Initial heap : ");
        mh.printHeap();
        System.out.println();

        mh.insert(14); 

        System.out.println("After inserting 14 : ");
        mh.printHeap(); 
        System.out.println();
    }
    
}
