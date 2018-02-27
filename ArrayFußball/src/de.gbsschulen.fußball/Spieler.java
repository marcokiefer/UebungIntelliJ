package de.gbsschulen.fußball;

import java.util.Objects;

public class Spieler {
    private String name;
    private int anzahlTore;
    private String spielPosition;

    public Spieler(String name, String spielPosition) {
        this.name = name;
        this.spielPosition = spielPosition;
        this.anzahlTore = 0;
    }

    public String getName() {
        return name;
    }

    public int getAnzahlTore() {
        return anzahlTore;
    }

    public String getSpielPosition() {
        return spielPosition;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSpielPosition(String spielPosition) {
        this.spielPosition = spielPosition;
    }

    public void torGeschossen(){
        this.anzahlTore ++;
    }

    public void druckeInfo(){
        System.out.println("Spieler:");
        System.out.println("Name: " + name + ", " + "Spielposition: " + spielPosition + ", " + "Anzahl geschossene Tore: " + anzahlTore);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Spieler spieler = (Spieler) o;
        return anzahlTore == spieler.anzahlTore &&
                Objects.equals(name, spieler.name) &&
                Objects.equals(spielPosition, spieler.spielPosition);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, anzahlTore, spielPosition);
    }
}
