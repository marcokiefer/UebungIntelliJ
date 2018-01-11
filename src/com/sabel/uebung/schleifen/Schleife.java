package com.sabel.uebung.schleifen;

public class Schleife {

    // Klassenmethode (statische Methode),
    //      diese Methode ist nicht an ein Objekt gebunden
    // Aufruf: Klassenname.Methodenname
    public static int summieren(int a, int b){
        int zaehler = a;
        int summe = 0;
        while (zaehler <= b){
            summe += zaehler;
            zaehler++;
        }
        return summe;
    }
    public static boolean isPrim(int n) {
        int teiler = 2;
        while (teiler <= n/2){
            if (n % teiler ==0){        // teil der Teiler die Zahl n ohne Rest, wenn ja, keine Primzahl
             return false;
            }
            teiler++;
        }
        // Wenn alle Teiler "getestet", dann ist n eine Primzahl
        return true;
    }


    public static void main(String[] args) {

        // Ausgabe aller Primzahlen von 1_000_000 bis 2_000_000
        int zahl = 80_000_001;
        while (zahl < 80_100_000){
            if (isPrim(zahl)) {
                System.out.println(zahl);
            }
            zahl+=2;
        }

//        // Ist 127 eine Primzahl
//        if (isPrim( 127)){
//            System.out.println(" Ist Primzahl");
//        } else {
//            System.out.println("ist Keine Primzahl");
//        }
//        System.out.println(isPrim( 127));
//
//        int summe = Schleife.summieren( 1, 10);
//        System.out.println(summe);
//
//        // Aufgabe 1: Ausgabe der Zahlen von 0 bis 5
//        int zahl = 0;
//        while (zahl < 5) {
//            System.out.println(zahl);
//            zahl++;
//        }
//        System.out.println("Wert von zahl nach der Schleife: " + zahl);
//
//        // Aufgabe 2: Ausgabe aller Vielfachen von Fünf von 20 bis 100 jeweils einschließlich
//        zahl = 20;
//        int count = 0;
//        while (zahl < 101) {
//
//            System.out.println(zahl);
//            zahl += 5;
//            count++;
//        }
////        System.out.println(zahl);
//        System.out.println("Die Schleife wurde " + count + " mal duchlaufen");
//
//        // Aufgabe 3: Ausgabe aller ungeraden Zahlen zwischen 3 und 250
//        zahl = 3;
//        while (zahl < 250){
//            if (zahl % 2 !=0){
//                System.out.println(zahl);
//            }
//            zahl ++;
//        }
    }
}
