/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package treemap;

import java.util.Scanner;

/**
 *
 * @author mrsci
 */
public class TreeMap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        java.util.TreeMap<String,Integer> myMap = new java.util.TreeMap<>();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string : ");
        String input = scanner.nextLine();

        //tokenize the input
        String[] tokens = input.split(" ");

        int count;
                
        for(String token : tokens)
        {
            String word = token.toLowerCase();

            if(myMap.containsKey(word)) //is word in map?
            {
                count = myMap.get(word);
                myMap.put(word,count+1);
            }
            else
                myMap.put(word,1); //add new word
        }

        System.out.print("Word Counts : ");
        System.out.println(myMap);
    }
    
}
