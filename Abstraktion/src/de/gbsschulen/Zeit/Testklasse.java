package de.gbsschulen.Zeit;

public class Testklasse {
    public static void main(String[] args) {
        Zeit zeit = new Tage(2);
        System.out.println("Anzahl der Sekunden: " + zeit.getSekunden());

        StundenMinuten sm = new StundenMinuten(3,0);
        System.out.println("Anzahl der Minuten: " + sm.getMinuten());
        System.out.println("Anzahl der Sekunden: " + sm.getSekunden());
    }
}
