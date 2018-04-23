package de.gbsschulen.telefonbuch;

import java.util.HashMap;

public class Telefonbuch {
    private HashMap<String, String> telefonbuch;

    public Telefonbuch() {
        telefonbuch = new HashMap<>();
    }

    public String nummerEintragen(String name, String nummer) {
        return telefonbuch.put(name, nummer);
    }

    public String nummerSuchen(String name) {
        return telefonbuch.get(name);
    }

    public static void main(String[] args) {
        Telefonbuch telefonbuch = new Telefonbuch();
        telefonbuch.nummerEintragen("Test1", "+490123023");
        String alteNummer = telefonbuch.nummerEintragen("Kiefer", "+23412322 2323 ");
        telefonbuch.nummerEintragen("Kiefer", "+01 78 55 112321 ");

        String suche = telefonbuch.nummerSuchen("Test");
        System.out.println(suche);
    }


}
