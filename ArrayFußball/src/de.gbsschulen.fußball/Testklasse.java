package de.gbsschulen.fußball;

public class Testklasse {
    public static void main(String[] args) {
        Mannschaft mannschaft = new Mannschaft("FC Bayern München");
        Spieler spieler = new Spieler("Ulreich", "Torwart");
        Spieler spieler1 = new Spieler("Robben", "Mittelfeld");
        Spieler spieler2 = new Spieler("Mueller", "Sturm");
        Spieler spieler3 = new Spieler("James", "Sturm");
        spieler2.torGeschossen();
        spieler3.torGeschossen();
        for (int i = 0; i < 5; i++) {
            spieler1.torGeschossen();
        }
        mannschaft.aufstellen(spieler,0);
        mannschaft.aufstellen(spieler1, 1);
        mannschaft.aufstellen(spieler2, 2);
        mannschaft.aufstellen(spieler3, 3);
        mannschaft.druckeAufstellung();
        System.out.println(mannschaft.anzahlTore());
        Spieler ausgewechselterSpieler = mannschaft.aufstellen(spieler1, 1);
        if (ausgewechselterSpieler != null){
            System.out.println("Ausgewechselt wurde: " + ausgewechselterSpieler.getName());
        }

        Spielplan spielplan = new Spielplan();
        spielplan.anmelden(mannschaft);
        spielplan.druckeTunier();
        Mannschaft mannschaft1 = new Mannschaft("Real Madrid");
        spielplan.anmelden(mannschaft1);
        spielplan.druckeTunier();

    }

}
