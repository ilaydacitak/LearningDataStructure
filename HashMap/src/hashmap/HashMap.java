/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hashmap;

/**
 *
 * @author mrsci
 */
public class HashMap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        java.util.HashMap<String,String> phoneBook = new java.util.HashMap<>();

        phoneBook.put("Ahmet", "555");
        phoneBook.put("Mehmet", "505");
        phoneBook.put("Ali", "532");
        phoneBook.put("Ayse", "542");
        phoneBook.put("Fatma", "545");

        //Phone number of Ali
        System.out.println("Phone number of Ali : " + phoneBook.get("Ali"));

        phoneBook.put("Ali", "535");

        //Phone number of Ali
        System.out.println("Phone number of Ali : " + phoneBook.get("Ali"));
    }
    
}
