package com.sabel.uebung.Flasche;

public class Flasche {
    private double aktuelleFuellmenge;
    private double maxFuellmenge;
    private String getraenk;

    public Flasche() {
        this.setMaxFuellmenge(500.0);
        this.setAktuelleFuellmenge(0.0);
        this.getraenk = "Bier";
    }

    public Flasche(double aktuelleFuellmenge, double maxFuellmenge, String getraenk) {
        this.setAktuelleFuellmenge(aktuelleFuellmenge);
        this.setMaxFuellmenge(maxFuellmenge);
        this.getraenk = getraenk;
    }

    public double getAktuelleFuellmenge() {
        return aktuelleFuellmenge;
    }

    public void setAktuelleFuellmenge(double aktuelleFuellmenge) {
        if (aktuelleFuellmenge >= 0 && aktuelleFuellmenge < maxFuellmenge){
            this.aktuelleFuellmenge = aktuelleFuellmenge;
        } else {
            System.out.println("Wenn nix drin, kannst nix raus machen");
        }
    }

    public double getMaxFuellmenge() {
        return maxFuellmenge;
    }

    public void setMaxFuellmenge(double maxFuellmenge) {
        if(maxFuellmenge > 5000 || maxFuellmenge < 0){
            System.out.println("Falscher Parameter");
            return;
        }
        this.maxFuellmenge = maxFuellmenge;
    }

    public String getGetraenk() {
        return getraenk;
    }

    public void setGetraenk(String getraenk) {
        this.getraenk = getraenk;
    }

    public void druckeInfo(){
        System.out.println("akutelle Füllmenge der Flasche: " +aktuelleFuellmenge);
        System.out.println("maximale Füllmenge der Flasche: " +maxFuellmenge);
        System.out.println("aktuelles Getränkt: " +getraenk);
        // --> alternative: System.out.println(this.toString());
    }

    @Override
    public String toString() {
        String result = "akutelle Füllmenge der Flasche: " +aktuelleFuellmenge +
                "\n" + "maximale Füllmenge der Flasche: " +maxFuellmenge +
                "\n" + "aktuelles Getränkt: " +getraenk;
        return result;
    }
}
