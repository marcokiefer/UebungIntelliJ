package com.sabel.dome;

public class CD extends Medium{
   private String kuenstler;
   private int titelanzahl;

    public CD(String titel, int spielzeit, String kuenstler, int titelanzahl) {
        super(titel, spielzeit);
        this.kuenstler = kuenstler;
        this.titelanzahl = titelanzahl;
    }

    public String gibKuenstler() {
        return kuenstler;
    }

    public int gibTitelanzahl() {
        return titelanzahl;
    }
}
