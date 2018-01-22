package com.sabel.uebung.Flasche;

import java.util.ArrayList;

public class Kasten {
    private ArrayList<Flasche> flaschen;
    private int maxAnzahlFalschen;

    public Kasten() {
        this.flaschen = new ArrayList<>();
    }
    public Kasten(int maxFuellmenge){
        this();
        this.maxAnzahlFalschen = maxFuellmenge;
    }
    public double getMaxAnzahlFalschen() {
        return maxAnzahlFalschen;
    }
    public int anzahlFalschen(){
        int anzahlFlaschen = flaschen.size();
        return anzahlFlaschen;
    }
    public boolean hinzufuegen(Flasche flasche){
        if (anzahlFalschen() < maxAnzahlFalschen){
            return flaschen.add(flasche);
        }
        return false;
    }
    public Flasche entnehmen(int index) {
        if (index >=0 && index < anzahlFalschen()) {
            return flaschen.remove(index);
        }
        System.out.println("Falscher Index");
        return null;
    }

    public ArrayList<Flasche> liefereAlleFlaschenMitMaxFuellmenge(double fuellmenge){
    ArrayList<Flasche> alleFlaschenGrosserAls = new ArrayList<>();
        for (Flasche flasche : flaschen) {
            if(fuellmenge <= flasche.getMaxFuellmenge()){
                alleFlaschenGrosserAls.add(flasche);
                flaschen.remove(flasche);
            }
        }
        return alleFlaschenGrosserAls;
    }

    @Override
    public String toString() {
        String str = "Kasten: \n";
        str += "akutelle Flaschenanzahl: " + anzahlFalschen() +"\n";
        str += "maximale Falschenanzahl: " + maxAnzahlFalschen + "\n";
        for (Flasche flasche : flaschen) {
            str += flasche.toString() + "\n";
        }
        return str;
    }
}
