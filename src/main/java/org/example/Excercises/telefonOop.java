package org.example.Excercises;

public class telefonOop {
    private int number;
    private String model;
    private double weight;
    public int age;

    public void sendMessage(int number, String name, String trescWiadomosci) {
        System.out.printf("Numer telefonu %d -> %s <- wysłał do Ciebie wiadomość o treści: -> %s\n", number, name, trescWiadomosci);
    }

    public telefonOop(int number, String model, double weight, int age) {
        this.number = number;
        this.model = model;
        this.weight = weight;
        this.age = age;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getModel(String model) {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getAge( int age) {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void getNumber(int numer, String name, double weight) {
        System.out.printf("Numer %d to %s dzwoni. Jego telefon waży %f gramów.\n", numer, name, weight);
    }

    public void receiveCall(String name) {
        System.out.printf("Dzwoni Twoja %s.\n", name);
    }

    public void receiveCall(String who, int number) {
        System.out.printf("%s dzwoni z pod takiego numeru: -> %d\n", who, number);
    }
    public telefonOop(){};

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }
    public void sendMessage2(int... numbers){
        for (int i = 0; i < numbers.length; i++) {
            System.out.printf("Wysłano wiadomość tekstową do numeru %f",numbers);
        }
    }
}
