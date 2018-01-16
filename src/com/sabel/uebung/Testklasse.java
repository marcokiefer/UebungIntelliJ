package com.sabel.uebung;

import java.util.ArrayList;

public class Testklasse {
    public static void main(String[] args) {
        System.out.println("---------Programm Beginn------");
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
        personenverwaltung.hinzufuegen(new Person("Tanja", 27));
        Person person1 = personenverwaltung.gibPerson(1);
        person1.setAlter(person1.getAlter()+1); // Tanja hat Geburtstag!
        personenverwaltung.gibPerson(1).setAlter(29);   // Tanja hat erneut Geburtstag!
        System.out.println(personenverwaltung.gibPerson(1));
        System.out.println("---------Alle Personen ausgeben: ------");
        personenverwaltung.allePersonenAnziegen();

        System.out.println("---------Personenverwaltung ausgeben: ------");
        System.out.println(personenverwaltung);
        System.out.println("---------Durchschnittalter ausgeben: ------");
        System.out.println(personenverwaltung.berechneDurchschnittsalter());

        System.out.println("---------Personen älter als------");
        // Aus der Personenverwaltung alle Personen die älter sind als 30
        ArrayList<Person> personenAelterAls30 = personenverwaltung.gibPersonenAelterAls(30);
        for (Person person2 : personenAelterAls30) {
            System.out.println(person2);

        }
        System.out.println("---------Programm ENDE------");
        vergleichenVonObjekten();
        //
//        int zahl = 101;
//        while (zahl <250){
//            System.out.println(zahl);
//            zahl = zahl +2;
//        }

    }
    public static void vergleichenVonObjekten(){
        // primitiver Datentyp -> Wert liegt direkt in der Speicherzelle -> Wertevergleich
        // Primitive Datentypen
        int zahl1 = 42;
        int zahl2 = 42;
        if (zahl1 == zahl2){
            System.out.println("gleich");
        } else {
            System.out.println("ungleich");
        }

        // Referezielle Datentypen
        Person person1 = new Person("Andreas",41);
        Person person2 = new Person("Andreas",41);
        // Referenzvergleich
        if (person1 == person2){
            System.out.println("Referenzvergleich: gleich");
        } else {
            System.out.println("Referenzvergleich: ungleich");
        }
        // Objektvergleich
        // Methode equals
        if (person1.equals(person2)){
            System.out.println("Objektvergleich: gleich");
        } else {
            System.out.println("Objektvergleich: ungleich");
        }

        String strl1 = "Hallo";
        String strl2 = new String("Hallo");
        if (strl1 == strl2){
            System.out.println("Referenzvergleich: gleich");
        } else {
            System.out.println("Referenzvergleich: ungleich");
        }

        if (strl1.equals(strl2)){
            System.out.println("Referenzvergleich: gleich");
        } else {
            System.out.println("Referenzvergleich: ungleich");
        }

    }

}
