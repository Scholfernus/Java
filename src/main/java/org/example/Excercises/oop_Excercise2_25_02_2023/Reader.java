package org.example.Excercises.oop_Excercise2_25_02_2023;

import java.util.Date;

public class Reader {
    private String fullName;
    private int biblioCard;
    private String kindOfStudy;
    private Date dateOfBirth;
    private int phoneNumber;

    public static void takeBook(String name, int numbOfBook) {
        System.out.printf("%s wypożyczył %d książek(ki).", name, numbOfBook);
    }

    ;

    public static void returnBook() {
    }

    ;

}
