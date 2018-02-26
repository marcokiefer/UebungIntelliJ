package de.gbsschulen.fußball;

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

}
