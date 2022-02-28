package com.company;

import java.util.Arrays;
import java.util.Spliterator;

public class Main {



    public static void main(String[] args) {
	// write your code here
        Main action = new Main();
        action.letterToNumber();
        System.out.println();
        action.numberToLetter();


    }
    public void letterToNumber(){
        //pænt er det ikke men kan ikke pt. komme på en bedre metode
        //så hvis denne kommentar er der i morgen, har dette ikke ændret sig
        int[] number={0,1,2,3};
        for (int i=0; i<number.length; i++){
            if (i==1){
                System.out.println("A");
            } else if (i==2){
                System.out.println("B");
            } else if (i==3){
                System.out.println("C");
            } else System.out.println(" ");
        }
    }

    public void numberToLetter(){
        String[] letter={" ","A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O",
            "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "Æ", "Ø", "Å"};
        //Dette kan nu udprinte et bogstav som et tal 0 er "whitespace" 1 = A, 2 = B etc.
        System.out.println(letter[1]);
        for (int i=0; i<letter.length; i++){
            System.out.println(letter[i]);
        }
    }
}
