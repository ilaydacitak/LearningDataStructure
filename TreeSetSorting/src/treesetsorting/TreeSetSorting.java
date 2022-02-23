/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package treesetsorting;

import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

/**
 *
 * @author mrsci
 */
public class TreeSetSorting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] colors = {"red", "white", "blue", "green", "gray", "orange", 
                "red","green", "cyan", "peach", "white", "orange"};

        List<String> list = Arrays.asList(colors);

        System.out.println("All colors : "  + list);

        TreeSet<String> set = new TreeSet<>(list);

        System.out.println("No duplicates (sorted) : "  + set);	
    }
    
}
