package org.example.Excercises.oop_Excercise2_25_02_2023;

public class Reader_Main {
    public static void main(String[] args) {
        Reader.takeBook("Jan Kowalski",5);
        Reader.takeBook("Peter Novicki", 3, "Przygody, Słownik, Encyklopedia");
        Book book = new Book("Adventures", "Jules Verne");
        Book book1 = new Book("Dictionary", "Oxford");
        Book book2 = new Book("Encyclopedia", "BBC");
        System.out.printf("%s\n",book);
        System.out.println("Jan nowicki wziął książki " + book + ", " + book1.toString() + ", " + book2.toString() + ".");
        Reader reader = new Reader();
        reader.setFullName("Jan Kowalski");
        reader.setKindOfStudy("Philosophy");
        String[][] daneBiblio = {
                {reader.getFullName(), reader.getKindOfStudy()}
        };
        for (int i = 0; i < daneBiblio.length; i++) {
            System.out.print("[ ");
            for (int j = 0; j < daneBiblio[i].length; j++) {
                System.out.print(daneBiblio[i][j] + ", ");
            }
            System.out.println("]");
        }
        String[][] biblio = new String[5][5];
        for (int i = 0; i < biblio.length; i++) {
            for (int j = 0; j < biblio[i].length; j++) {
                System.out.print(biblio[i][j] + ", ");
                daneBiblio = biblio;
            }
            System.out.println();
        }
    }
}
