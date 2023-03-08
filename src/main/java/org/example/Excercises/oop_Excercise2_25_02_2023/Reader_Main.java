package org.example.Excercises.oop_Excercise2_25_02_2023;

public class Reader_Main {
    public static void main(String[] args) {
//        Reader.takeBook("Jan Kowalski",5);
//        Reader.takeBook("Peter Novicki", 3, "Przygody, Słownik, Encyklopedia");
        Book[] books = new Book[10];
        books[0] = new Book("Adventures", "Jules Verne");
        books[1] = new Book("Dictionary", "Oxford");
        books[2] = new Book("Encyclopedia", "BBC");
        System.out.printf("%s\n", books);
        System.out.println("Jan Nowicki wziął książki " + books[0] + ", " + books[1] + ", " + books[2] + ".");
        Reader[] readers = new Reader[10];
        readers[0] = new Reader("Jan Kowalski", "Medicine");
        readers[0].takeBook(5);
        Reader.returnBook();
    }
}

