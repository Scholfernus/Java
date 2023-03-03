package org.example.Excercises.Array_3;

import java.util.Scanner;

public class arrayExcercise3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] array = new int[][]{
                {-3, 12, 4},
                {-7, 23, 17},
                {11, -5, 12},
        };
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print((array[i][j]) + ", ");
            }
            System.out.println(" ");

        }
        System.out.println();
        int[][] array2 = new int[][]{
                {4, 9, 8},
                {7, 5, 2},
                {3, 0, 6},
        };
        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2[i].length; j++) {
                System.out.print((array2[i][j]) + ", ");
            }
            System.out.println(" ");

        }
        System.out.println();
        int suma;
        int[][] array3 = new int[3][3];
        for (int i = 0; i < array3.length; i++) {
            for (int j = 0; j < array2[i].length; j++) {
                suma = array[i][j] + array2[i][j];
                System.out.print(suma + ", ");
                // arrey3 = suma;
            }
            System.out.println();
        }
        System.out.println("możesz zwiększyć wartości elementów tablicy mnożąc przez dowolną liczbę.\nPodaj liczbę całkowitą.");
        int multi = scanner.nextInt();
        int[][] array4 = new int[][]{
                {4, 9, 8},
                {7, 5, 2},
                {3, 0, 6},
        };
        for (int i = 0; i < array4.length; i++) {
            for (int j = 0; j < array4[i].length; j++) {
                System.out.print((array4[i][j])*multi + ", ");
            }
            System.out.println(" ");

        }
    }
}