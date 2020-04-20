package se.lexicon.arrays;

public class ArraysDemo3 {
    public static void main(String[] args) {
        char[][] grid = new char[10][10];
        initArray(grid);

        grid[0][4] = 'X';

        moveUp(grid);
        printArray(grid);

        /*
          0 1 2 3 4 5 6 7 8 9
        0
        1
        2
        3
        4         X
        5
        6
        7
        8
        9
         */
    }

    public static void moveUp(char[][] grid){
        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[i].length; j++){
                if(grid[i][j] == 'X'){
                    if((i-1) > 0){
                        grid[i][j] = '-';
                        grid[i-1][j] = 'X';
                    }
                }
            }
        }
    }

    public static void printArray(char[][] chars){
        for(int i=0; i < chars.length; i++){
            for(int j=0; j<chars[i].length; j++){
                System.out.print(chars[i][j]);
                if(j == chars[i].length-1){
                    System.out.println();
                }
            }
        }
    }

    public static void initArray(char[][] chars){
        for(int i=0; i<chars.length; i++){
            for(int j=0; j<chars[i].length; j++){
                chars[i][j] = '-';
            }
        }
    }

}
