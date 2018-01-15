package com.sabel.uebung.notizbuch;

public class Testklasse {
    public static void main(String[] args) {

        System.out.println("Programm gestartet");

        //Methodenaufruf
        Notizbuch notizbuch = new Notizbuch();
        System.out.println(notizbuch.anzahlNotizen());
        notizbuch.hinzufuegen("09:00 Uhr Kaffeepause");
        notizbuch.hinzufuegen("09:30 Uhr Mathe");
        notizbuch.hinzufuegen("11:00 Uhr Programmieren");
        System.out.println(notizbuch.anzahlNotizen());
        notizbuch.alleNotizenAnzeigen();
        System.out.println("--------------------------");
        notizbuch.zeigeNotiz(-3);
        notizbuch.zeigeNotiz(1);
        notizbuch.zeigeNotiz(3);
        System.out.println("--------------------------");
        String geloeschteNotiz = notizbuch.loescheNotiz(0);
        System.out.println("Gelöschte Notiz: "+ geloeschteNotiz);
        notizbuch.loescheNotiz(-2);
        System.out.println("--------------------------");
        System.out.println("--------------------------");
        System.out.println(notizbuch);


        //Programm beenden
        System.out.println("Programm beendet");

    }
}
