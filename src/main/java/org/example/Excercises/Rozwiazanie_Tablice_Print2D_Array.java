package org.example.Excercises;

import java.util.Scanner;
public class Rozwiazanie_Tablice_Print2D_Array {

        public static void main(String[] args) {

            System.out.print("Number of rows for 2d array: ");
            Scanner input = new Scanner(System.in);
            int Row = input.nextInt();

            System.out.print("Number of columns for 2d array: ");
            int Column = input.nextInt();

            //2d array declaration
            int[][] Demo_Array = new int[Row][Column];
            for (int x = 0; x < Row; x++) {
                for (int y = 0; y < Column; y++) {
                    System.out.print(String.format("Enter the array member at Demo_Array[%d][%d] : ", x, y));
                    Demo_Array[x][y] = input.nextInt(); //add the member to specific index
                }
            }
            //Print the 2d Array
            for (int x = 0; x < Demo_Array.length; x++) {
                for (int y = 0; y < Demo_Array[0].length; y++) {
                    System.out.print(Demo_Array[x][y] + "\t");
                }
                System.out.println();
            }
            // close the scanner object
            input.close();
        }
}
