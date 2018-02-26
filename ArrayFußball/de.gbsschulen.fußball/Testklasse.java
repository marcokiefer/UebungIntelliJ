package de.gbsschulen.fußball;

public class Testklasse {
    public static void main(String[] args) {
        Spieler spieler1 = new Spieler("Mueller", "Mittelfeld");
        Spieler spieler2 = new Spieler("Robben", "Sturm");
        Spieler spieler3 = new Spieler("Sepp", "Sturm");
        Spieler spieler4 = new Spieler("Robben", "Sturm");
        //spieler1.druckeInfo();
        spieler1.torGeschossen();
        spieler2.torGeschossen();
        //spieler1.druckeInfo();
        //spieler2.druckeInfo();
        Mannschaft mannschaft = new Mannschaft("FC Bayern München");
        mannschaft.aufstellen(spieler1,1);
        mannschaft.aufstellen(spieler2, 2);
        mannschaft.aufstellen(spieler3, 3);
        mannschaft.druckeMannschaftsaufstellung();
        mannschaft.anzahlTore();



    }




}
