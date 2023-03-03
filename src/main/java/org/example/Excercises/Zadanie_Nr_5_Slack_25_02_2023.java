package org.example.Excercises;

import java.util.Arrays;
import java.util.Random;

public class Zadanie_Nr_5_Slack_25_02_2023 {
    public static void main(String[] args) {
        //5. Znajdź maksymalną i minimalną wartość w każdym wierszu tablicy. Utwórz dwuwymiarową tablicę 5x8 typu int i zainicjalizuj ją blokiem inicjalizacyjnym.
        //Znajdź wartość maksymalną i minimalną w każdym "rzędzie" i zapisz te wartości do tablicy dwuwymiarowej 5x2.
        //Wydrukuj tablicę zawierającą wartości maksymalne i minimalne.
        System.out.println("Wynik losowania dowolnych liczb w zakresie od -50 do 50\nWypełnienie 2 tablic o rozmiarach 5x8");
        int[][] arrayTwo = fillArray();
        for (int k = 0; k < arrayTwo.length; k++) {
            for (int i = 0; i < arrayTwo[k].length; i++) {
                for (int j = 0; j < arrayTwo[k].length; j++) {
                    if (arrayTwo[k][i] < arrayTwo[k][j]) {
                        int temp = arrayTwo[k][i];
                        arrayTwo[k][i] = arrayTwo[k][j];
                        arrayTwo[k][j] = temp;
                    }
                }
            }
        }
        System.out.print(Arrays.deepToString(arrayTwo));
        System.out.println();
        for (int i = 0; i < arrayTwo.length; i++) {
            System.out.print("[");
            for (int j = 0; j < arrayTwo[i].length; j++) {
                if (i == 0 && j == 0 || i == 0 && j == 7 ||
                        i == 1 && j == 0 || i == 1 && j == 7 ||
                        i == 2 && j == 0 || i == 2 && j == 7 ||
                        i == 3 && j == 0 || i == 3 && j == 7 ||
                        i == 4 && j == 0 || i == 4 && j == 7) {
                    int[][] newArray = arrayTwo;
                    System.out.print(newArray[i][j] + ",");
                }
            }
            System.out.println("]");
        }

    }
    static int randomBetween(int start, int end) {
        Random random = new Random();
        int a =random.nextInt(end - start + 1);
        int b = a + start;
        return b;
    }
    public static int[][] fillArray(){
        int [][] matrix = new int[5][8];
        for (int i = 0; i < matrix.length; i++) {
            System.out.print("[ ");
            for (int j = 0; j < matrix[i].length; j++) {
                if (j != matrix[i].length - 1) {
                    matrix[i][j] = randomBetween(-50, 50);
                    System.out.print(matrix[i][j] + ", ");
                } else {
                    System.out.print(matrix[i][j] + ".");
                }
            }
            System.out.println("]");
        }
        return matrix;
    }
    public static int [][] printArray(){
        int [][]arrayTwo = new int[5][8];

        return arrayTwo;
    }

}
