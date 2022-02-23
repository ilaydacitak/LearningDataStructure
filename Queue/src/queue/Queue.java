/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package queue;

/**
 *
 * @author mrsci
 */
public class Queue {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SLLQueue<String> myQueue = new SLLQueue<>();
        
        myQueue.enqueue("Göktuğ");
        myQueue.enqueue("Ahmet");
        myQueue.enqueue("Sevcan");
        myQueue.enqueue("Emre");
        myQueue.enqueue("Samet");
  
        System.out.println(myQueue);
        
        System.out.println("front : " + myQueue.front());
        
        System.out.println(myQueue);
        
        myQueue.dequeue();
        myQueue.dequeue();
        
        System.out.println(myQueue);
        
        myQueue.enqueue("Erkin");
        
        System.out.println(myQueue);
        
        myQueue.dequeue();
        myQueue.dequeue();
        myQueue.dequeue();
        myQueue.dequeue();
        
        System.out.println(myQueue);
    }
    
}
