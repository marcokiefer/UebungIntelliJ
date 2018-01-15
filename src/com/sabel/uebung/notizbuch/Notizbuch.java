package com.sabel.uebung.notizbuch;

import java.util.ArrayList;

public class Notizbuch {
    private ArrayList<String> notizen;
    // Default Konstruktor
    public Notizbuch() {
        notizen = new ArrayList<>();
    }
    // Methode zum hinzugfuegen
    public void hinzufuegen(String notiz) {
        notizen.add(notiz);
    }
    // Methode löschen
    public String loescheNotiz(int index) {
        if (index < 0 || index >= anzahlNotizen()) {
            System.out.println("Falscher Index");
            return null;
        }
        String zuLoeschendeNotiz = notizen.get(index);
        notizen.remove(index);
        return zuLoeschendeNotiz;
    }

    public int anzahlNotizen() {
        return notizen.size();              //Liefert die Anzahl der Notizen
    }

    public void zeigeNotiz(int index) {
        if (index < 0) {
            System.out.println("Index darf nicht negativ sein");
        } else if (index < anzahlNotizen()) {
            System.out.println(notizen.get(index));
        } else {
            System.out.println("Index zu groß");
        }
    }

   // 15.01.18 Schleife für die Ausgabe
    public void alleNotizenAnzeigen() {
        int index = 0;
        while (index < notizen.size()){
            System.out.println(notizen.get(index));
            index ++;
        }
    }

    public String toString() {
        String result = "Notizbuch:\n";
        for (String notiz: notizen) {
            result = result + notiz + "\n";
        }
        return result;
    }
}
