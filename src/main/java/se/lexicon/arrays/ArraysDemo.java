package se.lexicon.arrays;

import java.util.Scanner;

public class ArraysDemo {
    //Starts the application
    public static void main(String[] args) {
        int[] ints = new int[5];
        String[] names = {
          "Erik",
          "Ameer",
          "Benjamin",
          "Patrik",
          "Carl"
        };

        for(int i=0; i<names.length; i++){
            System.out.println(names[i]);
        }
    }
}
