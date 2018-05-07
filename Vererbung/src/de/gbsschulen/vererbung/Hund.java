package de.gbsschulen.vererbung;

public class Hund extends Tier {
    private boolean isBissig;

    /*
    public Hund () {                // Wird automatisch von Java eingefügt
        super ("Bello",1);          // Aufruf des Default-Konstruktors der Elternklasse
    }
    */

    public Hund (String name, int alter, boolean isBissig){
        super (name, alter);
        this.isBissig = isBissig;
    }

    public boolean IsBissig() {
        return isBissig;
    }

    public void setBissig(boolean bissig) {
        isBissig = bissig;
    }

    @Override
    public void fressen() {
        // super.fressen();
        System.out.println("Der Hund frisst");
    }


}
