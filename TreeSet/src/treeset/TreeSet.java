/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package treeset;

/**
 *
 * @author mrsci
 */
public class TreeSet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        java.util.TreeSet<String> names = new java.util.TreeSet<>();

        names.add("Ahmet");
        names.add("Mehmet");
        names.add("Ali");
        names.add("Ayse");
        names.add("Fatma");

        for(String item : names)
            System.out.println(item);

        System.out.println("*****************");

        names.add("Ali");

        for(String item : names)
            System.out.println(item);
    }
    
}
