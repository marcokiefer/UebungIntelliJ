package com.sabel.uebung;

import java.util.ArrayList;

public class Personenverwaltung {
            // - person: ArrayList<Person>
            // - maxAnzahlPersonen : int
            // + Personenverwaltung (int)
            // + anzahlPersonen(): int
            // + hinzufuegen(Person): boolean
            // + loeschePerson (index:int) : Person
            // + gibtPerson(index:int) : Person
            // + allePersonenAnzeigen(): void
            // + toString() : String

    private ArrayList<Person> personen;
    private int maxAnzahlPersonen;

    private Personenverwaltung() {
        this.personen = new ArrayList<>();
    }

    public Personenverwaltung(int maxAnzahlPersonen) {
        this();
        this.maxAnzahlPersonen = maxAnzahlPersonen;
    }

    public int anzahlPersonen(){
        return personen.size();
    }

    public boolean hinzufuegen(Person person){
    if(anzahlPersonen() < maxAnzahlPersonen) {
        return personen.add(person);
    }
        return false;
    }

    public Person loeschePerson(int index){
        // Prüfung gültiger Bereich
        // if (index >= 0 && index < anzahlPersonen())
        // Prüfung ungültiger Bereich
        if(index <0 || index >= anzahlPersonen()) {
            System.out.println("Falscher Index");
            return null;
        }
         //   Person zuloeschendePerson = personen.get(index);
            return personen.remove(index);
         //   return zuloeschendePerson;
        }
//
//    public Person gibPerson(int index){
//
//    }
//
//    public void allePersonenAnziegen(){
//
//    }
//
//    public double berechneDurchschnittsalter(){
//
//    }


    @Override
    public String toString() {
        return "Personenverwaltung{" +
                "person=" + personen +
                ", maxAnzahlPersonen=" + maxAnzahlPersonen +
                '}';
    }
}
