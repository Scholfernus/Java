package org.example.Excercises.oop_Excercise2_25_02_2023;

import java.util.Date;

public class Reader {
    private String fullName;
    private int biblioCard;
    private String kindOfStudy;
    private Date dateOfBirth;
    private int phoneNumber;

    public void takeBook( int numbOfBook) {
        System.out.printf("%s wypożyczył %d książek(ki).\n", this.fullName, numbOfBook);
    }
    public void takeBook(int howMany, String book){
        System.out.printf("%s wziął %d książek(ki): %s\n",this.fullName,howMany,book);
    }

    public static void returnBook() {
    }

    public Reader(String fullName, int biblioCard, String kindOfStudy, Date dateOfBirth, int phoneNumber) {
        this.fullName = fullName;
        this.biblioCard = biblioCard;
        this.kindOfStudy = kindOfStudy;
        this.dateOfBirth = dateOfBirth;
        this.phoneNumber = phoneNumber;
    }
    public Reader (String fullName, String kindOfStudy){
        this.fullName = fullName;
        this.kindOfStudy = kindOfStudy;
    }
    public Reader (){};
    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getBiblioCard() {
        return biblioCard;
    }

    public void setBiblioCard(int biblioCard) {
        this.biblioCard = biblioCard;
    }

    public String getKindOfStudy() {
        return kindOfStudy;
    }

    public void setKindOfStudy(String kindOfStudy) {
        this.kindOfStudy = kindOfStudy;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
