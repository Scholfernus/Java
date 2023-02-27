package org.example.Excercises;

import java.util.Arrays;

public class Excercise1ArraysSaturday25_02_2023 {
    public static void main(String[] args) {
        //1. Jednowymiarowa tablica typu String. Utwórz tablicę typu String o rozmiarze 7. Wpisz do niej wartości dni tygodnia.
        //Wypisz wartość ostatniego elementu do konsoli. Wypisz wartość środkowego elementu do konsoli.
        String[] daysOfWeek = {"Monday", "Thuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        System.out.println("Last day of the week is: " + daysOfWeek[6]);
        System.out.println("Middle day of the week is: " + daysOfWeek[3]);

        //2. Tablicę jednowymiarową typu double. Utwórz tablicę typu double o rozmiarze 4. Zapisz do niej dowolne wartości
        // za pomocą bloku inicjalizacyjnego. Wypisz na konsolę wartość pierwszego elementu.
        double[] numbers = {3.1, 2.0, 5.44, 3.0};
        System.out.println("Pierwsza cyfra tablicy to: " + numbers[0]);

        //3. Utwórz dwuwymiarową tablicę typu String. Utwórz tablicę typu String o rozmiarze 3x6. Wpisz do niej wartości:
        //a1 a2 a3 a4 a5 a6  //b1 b2 b3 b4 b5 b6  //c1 c2 c3 c4 c5 c6  //Wydrukuj tablicę.
        String[][] letters = {
                {"a1", "a2", "a3", "a4", "a5", "a6"},
                {"b1", "b2", "b3", "b4", "b5", "b6"},
                {"c1", "c2", "c3", "c4", "c5", "c6"},
                {"d1", "d2", "d3", "d4", "d5", "d6"},
        };
        for (int i = 0; i < letters.length; i++) {
            System.out.print("[ ");
            for (int j = 0; j < letters[i].length; j++) {
                if (j!=letters[i].length-1){

                    System.out.print(letters[i][j] + ", ");
                }else {
                    System.out.print(letters[i][j] + ". ");
                }
            }
            System.out.println("]");
        }
        // 4. Dwuwymiarowa tablica char. Utwórz dwuwymiarową tablicę char o rozmiarze 4x2. Zapisz wartości do tablicy za pomocą bloku inicjalizacyjnego.
        //Wydrukuj wartości z tablicy.
        char[][] znaki = {
                {'A', 'b', 'C','D'},
                {'E', 'F', 'G','H'},
                {'I', 'J', 'K','L'},
        };
        for (int i = 0; i < znaki.length; i++) {
            System.out.print("[ ");
            for (int j = 0; j < znaki[i].length; j++) {

                System.out.print(znaki[i][j] + ", ");
            }
            System.out.println("]");
        }
    }
}
