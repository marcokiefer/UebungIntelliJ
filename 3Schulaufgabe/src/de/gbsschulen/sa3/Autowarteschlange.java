package de.gbsschulen.sa3;

import java.util.Arrays;

public class Autowarteschlange {
    private Auto[] autos;
    private int anzahlAutos;

    public Autowarteschlange(int maxAnzahlAutos) {
        this.autos = new Auto[maxAnzahlAutos];
        this.anzahlAutos = 0;
    }

    public boolean istLeer(){
        return anzahlAutos == 0;
    }

    public boolean istVoll(){
        return anzahlAutos == autos.length;
    }

    public void hintenAnstellen(Auto auto){
        if(!istVoll()) {
            this.autos[anzahlAutos++] = auto;
        } else {
            System.out.println("Kein Platz mehr vorhandnen!");
        }
    }

    public Auto vorneAbfahren(){
        Auto erstesAuto = null;
        if(!istLeer()){
            erstesAuto = autos[0];
            for (int i = 0; i < anzahlAutos -1; i++){
                autos[i] = autos[i+1];
            }
            autos[--anzahlAutos] = null;                //[--anzahlAutos]   prä Inkrement
            } else {                                    //[anzahlAutos--]   post Inkrement
            System.out.println("Kein Auto in Warteschlange vorhanden");
        }
        return erstesAuto;
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder( "Autowarteschlange: \n");
        for (int i = 0; i < anzahlAutos; i++) {
            Auto auto = autos[i];
            if(auto != null){
                sb.append((i+1) + ". Auto: "+ auto.datenwerteGeben() + "\n");
            }
        }
        sb.append( "Anzahl Autos: " + anzahlAutos);
        return sb.toString();
    }
}
