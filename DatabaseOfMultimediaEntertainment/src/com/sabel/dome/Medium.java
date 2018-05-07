package com.sabel.dome;

public class Medium {
    private String titel;
    private int spielzeit;
    private boolean habich;
    private String kommentar;

    public Medium(String titel, int spielzeit) {
        this.titel = titel;
        this.spielzeit = spielzeit;
    }

    public boolean gibVorhanden() {
        return habich;
    }

    public void setHabIch(boolean habich) {
        this.habich = habich;
    }

    public String gibKommentar() {
        return kommentar;
    }

    public void setzeKommentar(String kommentar) {
        this.kommentar = kommentar;
    }

    public void ausgeben(){
        System.out.println("Titel: " + this.titel + " (" + this.spielzeit +" Min)");
    }
}
