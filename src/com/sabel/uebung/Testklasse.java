package com.sabel.uebung;

public class Testklasse {
    public static void main(String[] args) {
        Person person = new Person("Tom", 32);
//        System.out.println(person.getName());
//        System.out.println(person.getAlter());
//        person.druckeInfo();
//        System.out.println(person);
        Personenverwaltung personenverwaltung = new Personenverwaltung(3);
        System.out.println(personenverwaltung.anzahlPersonen()); // Leere Liste ==> 0
        personenverwaltung.hinzufuegen(person);
        personenverwaltung.hinzufuegen(new Person("Max",37)); //annomes Objet, weil keine lokale Peferrenz
        System.out.println(personenverwaltung.anzahlPersonen()); // Zwei Personen hinzugefügt --> 2
        Person geloeschtePerson = personenverwaltung.loeschePerson(1); // Referenz aus ArrayList löschen und in lokaler Variable sichern
        System.out.println(personenverwaltung.anzahlPersonen());
        System.out.println(geloeschtePerson);


        System.out.println("Testausgabe");

        //
//        int zahl = 101;
//        while (zahl <250){
//            System.out.println(zahl);
//            zahl = zahl +2;
//        }


    }
}
