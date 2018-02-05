package com.sabel.uebung.Flasche;

public class Testklasse {
    public static void main(String[] args) {
        Flasche flasche = new Flasche();
        Flasche flasche1 = new Flasche(50, 500, "Spezi");
        flasche.druckeInfo();
        Flasche falsche = new Flasche(25, 500, "Cola");
        falsche.druckeInfo();
        System.out.println("------ Start Kasten ------");
        Kasten kasten = new Kasten(12);
        kasten.anzahlFalschen();
        kasten.hinzufuegen(flasche);
        System.out.println(kasten);
        kasten.entnehmen(0);
        System.out.println(kasten);
        kasten.hinzufuegen(flasche);
        System.out.println(kasten);

    }
}
