package de.gbsschulen.allgemein;

public class Testklasse {

    public static void main(String[] args) {
        Tier tier = new Hund("Bello",42,false);
        tier.fressen();
        tier.setAlter(tier.getAlter());
        // tier.setBissig(ture);        // Compiler-Fehler: staatische Typprüfung
                                        // nur Methoden aus der Klasse Tier!

        if (tier instanceof Hund) {     // Sollte immer mit einer Prüfung vorneweg gemacht werden
            Hund hund = null;
            hund = (Hund) tier;
            hund.setBissig(true);       // Cast auf ein Hund
        }

        // Alternativ
        ((Hund) tier).setBissig(true);

        Tier t = new Tier("....",43);
        Hund h = new Hund(".....", 10,false);
        t.fressen();        // " Das Tier frisst "
        h.fressen();        // " Das Tier frisst "
        h.fressen();        // " Der Hund frisst "

        tier.fressen();     // " Der Hund frisst "









    }
}
