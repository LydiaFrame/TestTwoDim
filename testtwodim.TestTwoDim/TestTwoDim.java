/*
 * Program: TestArray.java
 * Student: Lydia Frame 
 * Purpose: Create a two-dimensional array and print result. Upload .java file to Canvas as TestTwoDim.
*/

import java.util.Scanner; 

public class TestTwoDim {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        //Get size of arrays
        System.out.print("Enter number of rows: ");
        int rows = input.nextInt();    
        
        System.out.print("Enter number of columns: ");
        int columns = input.nextInt(); 

        //create array
        int[][] grid = createGrid(rows, columns); 
        
        //print array
        printGrid(grid);

        input.close();

    }

    //create the array method
    public static int[][] createGrid(int rows, int columns) {
        
        int value = 0;
        int[][] array = new int[rows][columns]; 

        for (int i = 0; i < rows; i++){
            for (int j = 0; j < columns; j++){
                array[i][j] = value;
                value++;
            }
        }

        return array;
    }

    //print array method
    public static void printGrid(int[][] array){

        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++){
                System.out.print(array[i][j] + " ");
            }

            System.out.println();
        }
    }
}
