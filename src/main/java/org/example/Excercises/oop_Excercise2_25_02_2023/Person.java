package org.example.Excercises.oop_Excercise2_25_02_2023;

public class Person {
    private String fullName;
    private int age;

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public static void move(String fullName) {
        System.out.printf("Person %s move.\n",fullName);
    }
    public static void talk(String name, int age){
        System.out.printf("Person %s mówi, że ma %d lat.", name,age);
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}


