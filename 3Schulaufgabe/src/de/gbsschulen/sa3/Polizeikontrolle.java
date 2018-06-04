package de.gbsschulen.sa3;

import java.util.ArrayList;

public class Polizeikontrolle {
    private Autowarteschlange autowarteschlange;
    private ArrayList<Auto> kontrolierteAutos;

    public Polizeikontrolle(Autowarteschlange autowarteschlange) {
        this.autowarteschlange = new Autowarteschlange(3);
        this.kontrolierteAutos = new ArrayList<>();
    }

    public void autoHeranwinken(Auto auto){
        if(!autowarteschlange.istVoll()){
            autowarteschlange.hintenAnstellen(auto);
        } else {
            System.out.println("Kein Platz mehr");
        }
    }

    public void autoKontrollieren(){
        if(!autowarteschlange.istLeer()){
            Auto auto = autowarteschlange.vorneAbfahren();
            auto.setInOrdnung(pruefergebnis());
        }
    }

    private boolean pruefergebnis(){
        return Math.random() * 100 > 90;
    }

    public void kontrollListeAusgben(){
        StringBuilder sb = new StringBuilder();
        sb.append("Kontrollierte Autos: \n");
        String result = "Kontrollierte Autos: \n";
        for (Auto kontrolierteAuto : kontrolierteAutos) {
            sb.append(kontrolierteAuto.datenwerteGeben() + "\n");
        }
        sb.append(kontrolierteAutos.size() + " kontrolierte Autos");
        System.out.println(sb.toString());
    }
}
