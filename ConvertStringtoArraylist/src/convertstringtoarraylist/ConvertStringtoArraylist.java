/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package convertstringtoarraylist;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author mrsci
 */
public class ConvertStringtoArraylist {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String str; // variable declaration.

        int i; //define variable.

        Scanner ob1 = new Scanner(System.in); //creating scanner class object.

        System.out.print("Enter any string: "); //message

        str = ob1.nextLine();//input value in str variable.

        ArrayList<Character> ob2 = toCharacterArray(str); //create ArrayList reference variable and call toCharacterArray() function

        System.out.print("Elements of the character array list: ");//message

        for(i = 0;i<ob2.size();i++) //loop

        {

            System.out.print(ob2.get(i) + " "); //print value.

        }
    }
    
    public static ArrayList<Character>toCharacterArray(String s){

    ArrayList<Character> ob = new ArrayList<Character>(); //create ArrayList object.

        for(char ch1: s.toCharArray()) {
        ob.add(ch1); //add Character in list.
        }
        return ob; //return the object i.e return the value
}
    
}
