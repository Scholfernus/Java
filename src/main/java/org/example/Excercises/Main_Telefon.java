package org.example.Excercises;

public class Main_Telefon {
    public static void main(String[] args) {
        telefonOop telefonOop = new telefonOop();
        telefonOop.receiveCall("Aldona");
        telefonOop.receiveCall("Szef", 648_845_558);
        telefonOop.getNumber(689_478_698, "Anna", 0.237);
        telefonOop.sendMessage(654_456_789, "Wojtek", "Zadzwoń do mnie");
        telefonOop phone1 = new telefonOop();
        System.out.println("Marka jej telefonu to " + phone1.getModel("Samsung").toString());
        System.out.printf("On ma %d lat.", telefonOop.getAge(45));
        //phone1.sendMessage2(new int[] {456_789_159, 789_987_654, 693_258_741});

    }

}
