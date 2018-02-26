package de.gbsschulen.fußball;

public class Mannschaft {
    private String name;
    private Spieler[] aufstellung;

    public Mannschaft(String name) {
        this.name = name;
        this.aufstellung = new Spieler[11];
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Spieler aufstellen(Spieler spieler, int position) {
        if(position < 0 || position >= this.aufstellung.length){
            System.out.println("Position " + position +" ist falsch");
            return null;
        }
        Spieler ausgewechselterSpieler = this.aufstellung[position];
        this.aufstellung[position] = spieler;
        return ausgewechselterSpieler;
    }

    public void druckeMannschaftsaufstellung() {
        System.out.println(name);
        for (int i = 1; i < aufstellung.length; i++) {
            Spieler spieler = aufstellung[i];
            if (spieler != null) {
                System.out.println(i + " " + spieler.getName());
            } else {
                return;
            }
        }
    }

    public int anzahlTore(){
        int toreGesamt = 0;
        for (int i = 1; i < aufstellung.length; i++) {
            toreGesamt = aufstellung[i].getAnzahlTore();
        }
        return toreGesamt;
    }
}
