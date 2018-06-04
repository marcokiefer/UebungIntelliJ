package de.gbsschulen.allgemein;

import java.util.Objects;

public class Hund extends Tier{
    private boolean isBissig;

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
        //super.fressen();
        System.out.println("Der Hund frisst");
    }

    @Override
    public String toString() {
       String isBissig = "ja";
       if (!this.isBissig) {
           isBissig = "nein";
       }
       return super.toString() + ", Bissig: " + isBissig;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Hund hund = (Hund) o;
        return isBissig == hund.isBissig;
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), isBissig);
    }
}
