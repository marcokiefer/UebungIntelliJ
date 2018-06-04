package de.gbsschulen.allgemein;

import java.util.ArrayList;

public class Testklasse {

    public static void main(String[] args) {
        Tier tier = new Tier("Hans",55);
        Hund hund = new Hund ("Bello",42,false);
        tier.fressen();
        tier.setAlter(tier.getAlter());
        // tier.setBissig(ture);        // Compiler-Fehler: staatische Typprüfung
                                        // nur Methoden aus der Klasse Tier!

        if (tier instanceof Hund) {     // Sollte immer mit einer Prüfung vorneweg gemacht werden
            hund = (Hund) tier;
            hund.setBissig(true);       // Cast auf ein Hund
        }

        Tier t = new Tier("....",43);
        Hund h = new Hund(".....", 10,false);
        t.fressen();        // " Das Tier frisst "
        h.fressen();        // " Das Tier frisst "
        h.fressen();        // " Der Hund frisst "
        tier.fressen();     // " Der Hund frisst "

        System.out.println(tier.toString());
        System.out.println(hund);

        Tier tier1 = new Tier("Hans",54);

        // Referenzvergleich
        if(tier == tier1){
            System.out.println("Referenzvergleich: true");
        } else {
            System.out.println("Referenzvergleich: false");
        }
        // Objektvergleich
        if(tier.equals(tier1)){
            System.out.println("Objektvergleich: true");
        } else {
            System.out.println("Objektvergleich: false");
        }





    }
}
