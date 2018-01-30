package com.sabel.uebung.Schulaufgabe;

public class Schnitzel {
    private String fleischart;
    private double gewichtinGramm;
    private String panade;
    private boolean gebraten;

    public Schnitzel(String fleischart, double gewichtinGramm) {
        this.fleischart = fleischart;
        this.setGewichtinGramm(gewichtinGramm);
        this.panade = null;
        this.gebraten = false;
    }

    public double getGewichtinGramm() {
        return gewichtinGramm;
    }

    public boolean isGebraten() {
        return gebraten;
    }
    public void druckeInfo(){
        String ausgabe = fleischart + "-Schnitzel mit ";
        String panade = this.panade;
        if (panade == null){
            panade = "keiner ";
        }
        ausgabe += panade + "Panande, " + getGewichtinGramm() + " Gramm, ";
        String bratstatus = "ungebraten";
        if(this.gebraten){
            bratstatus = "gebraten";
        }
        ausgabe += bratstatus + ".";
        System.out.println(ausgabe);

    }

    public void setGewichtinGramm(double gewichtinGramm) {
        if(gewichtinGramm < 0){
            System.out.println("Gewicht darf nicht negativ sein");
            return;
        }
        this.gewichtinGramm = gewichtinGramm;
    }
    public void braten() {
        if (!this.gebraten){
            this.gebraten = true;
            this.gewichtinGramm = this.gewichtinGramm * 0.75;
        } else {
            System.out.println("Das Schnitzel kann nicht gebraten werden, da es schon gebraten ist!");
        }
    }

    public void setPanade(String panade) {
        this.panade = panade;
    }
}
