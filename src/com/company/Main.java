package com.company;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Spliterator;

public class Main {

Scanner keyboard = new Scanner(System.in);


    public static void main(String[] args) {
	// write your code here
        Main action = new Main();
        action.letterToNumber();
        System.out.println();
        //action.numberToLetter();


    }
    public void letterToNumber(){
        //gået op for mig at denne nok kraver at kunne bruge codepoints
        //dette har jeg ikke fundet ud af endnu
            String alfabet = " ABCDEFGHIJKLMNOPQRSTRUVWXYZÆØÅ";
            for (int i=0;i<alfabet.length();i++){
                char c = alfabet.charAt(1);
                System.out.println(c);
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
