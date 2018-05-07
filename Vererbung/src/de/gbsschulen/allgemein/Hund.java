package de.gbsschulen.allgemein;

public class Hund extends Tier{
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

    public boolean getIsBissig() {
        return isBissig;
    }

    public void setBissig(boolean bissig) {
        isBissig = bissig;
    }

    @Override       // Annotation: Zusatz für den Compiler
                    // Prüf ob die Methode in der Elternklasse vorhanden ist
    public void fressen() {
        System.out.println("Der Hund frisst");
    }
}
