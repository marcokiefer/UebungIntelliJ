package de.gbsschulen.testklasse;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

public class Testklasse {


        public static void main(String[] args) {
        ArrayList<String> namensliste = new ArrayList<>();
        HashSet<String> hashListe = new HashSet<>();
        namensliste.add("Maier");
        namensliste.add("Mueller");
        namensliste.add("Mueller");
        namensliste.add("Schulze");
        namensliste.add("Aschenbrenner");
        hashListe.add("Maier");
        hashListe.add("Mueller");
        hashListe.add("Mueller");
        hashListe.add("Schulze");
        hashListe.add("Aschenbrenner");
        // Ausgabe
        System.out.println("---------- Nur die Ausgabe der ArrayList: ");
        for (String name : namensliste) {
            System.out.println(name);
        }
        // Sortieren
        Collections.sort(namensliste);
        //Ausgabe nun sortiert
        System.out.println("---------- Sortierte ArrayListe: ");
        for (int i = 0; i < namensliste.size(); i++) {
            System.out.println(namensliste.get(i));
        }
        // Ausgabe mit Iterator
        Iterator<String> iterator = namensliste.iterator();
        while (iterator.hasNext()){
            String name = iterator.next();
            System.out.println(name);
        }

        // Ausgabe
        System.out.println("---------- Nur die Ausgabe der HashListe: ");
        Iterator<String> it = namensliste.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
            System.out.println(addRekursiv(2,5));
        }

    public static int addRekursiv(int a, int b){
        // Terminierungsfall
        if (b == 0) {
            return a;
        }
        // Rekursivonsschritt
        a++;
        b--;
        return addRekursiv(a,b);
    }



}
