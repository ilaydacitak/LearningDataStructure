/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package stack;

/**
 *
 * @author mrsci
 */
public class Stack {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SLLStack<String> myStack = new SLLStack<>();
        
        myStack.push("Göktuğ");
        myStack.push("Ahmet");
        myStack.push("Sevcan");
        myStack.push("Emre");
        myStack.push("Samet");
        
        System.out.println(myStack);
      
        System.out.println("top : " + myStack.top());
        
        System.out.println(myStack);
        
        myStack.pop();
        myStack.pop();
        
        System.out.println(myStack);
        
        myStack.push("Erkin");
        System.out.println(myStack);
        
        myStack.pop();
        myStack.pop();
        myStack.pop();
        myStack.pop();
        
        System.out.println(myStack);
    }
    
}
