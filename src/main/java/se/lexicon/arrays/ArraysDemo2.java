package se.lexicon.arrays;

public class ArraysDemo2 {
    public static void main(String[] args) {
        String[] strings = new String[] {"J", "A", "V", "A"};
        String[] otherArray = {"Erik", "Ulf", "Benjamin", "Simon", "Fredrik"};
        System.out.println(findString(otherArray,"simon"));
    }

    public static String findString(String[] strings, String query){
        for(String string : strings){
            if(string.equalsIgnoreCase(query)){
                return string;
            }
        }
        return "Couldn't find string with value = " +query;
    }

    public static String getLongestString(String[] array){
        int maxLength = 0;
        String longestString = null;
        for(int i=0; i<array.length; i++){
            String string = array[i];
            if(string.length() > maxLength){
                maxLength = string.length();
                longestString = string;
            }
        }
        return longestString;
    }

    public static void printArray(String[] toPrint){
        for(String string : toPrint){
            System.out.println(string);
        }
    }

}
