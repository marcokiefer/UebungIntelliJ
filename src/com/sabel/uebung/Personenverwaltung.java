package com.sabel.uebung;

import java.util.ArrayList;

public class Personenverwaltung {
    private ArrayList<Person> person;
    private int maxAnzahlPersonen;

    public Personenverwaltung(ArrayList<Person> person) {
        this.person = person;
    }
    public int anzahlPersonen(){
        return person.size();
    }
    public boolean hinzufuegen(Person){

    }

    public Person loeschePerson(){

    }
    public Person gibPerson(){

    }
    public void allePersonenAnziegen(){

    }
    public double berechneDurchschnittsalter(){

    }


    @Override
    public String toString() {
        return "Personenverwaltung{" +
                "person=" + person +
                ", maxAnzahlPersonen=" + maxAnzahlPersonen +
                '}';
    }
}
