package com.sabel.array;

public class Mathe {
    
    public static double summe(double[] a){
        double summe = 0.0;
        for (int i = 0; i < a.length; i++) {
            summe += a[i];      // a an der Stelle i (Wert an der Stelle i)
        }
        return summe;
    }

    public static void main(String[] args) {
        double[] messwerte  = new double[12];
        messwerte[0] = -10.7;
        double[] temperaturen = new double [] {-10.7, -11.2, -10.9, -10.4, -10.5};
        // reicht auch double[] temperaturen = {-10.7, -11.2, -10.9, -10.4, -10.5};
        double summeAllerTemperaturen = summe(temperaturen);
        System.out.println("Summe aller Temperaturen: " + summeAllerTemperaturen);
        System.out.println("Durchschnittstemperatur: " + summeAllerTemperaturen / temperaturen.length);

        // Aufgabenblatt Array
        // Aufgabe 1
        int[] quadrat = new int[20];
        for (int i = 0; i < quadrat.length; i++) {
            int ergebnis = i * i;
            System.out.println(ergebnis);
        }
        // Aufruf der Methoden
        druckeArray(quadrat);
        int n = 123;
        System.out.println("Quersumme von " + n + " = " + quersummeBerechnen(n));

        // Aufgabe 4
        int[] quersumme = new int[50];
        for (int i = 0; i < quersumme.length; i++) {
            int einerStelle = i % 10;
            int zehnerStelle = i /10;
            System.out.println("Index: " + i + "Quersumme: " + (einerStelle+zehnerStelle));
        }

    }
        // Aufgabe 2
    public static void druckeArray(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            System.out.printf("%3d   ", a[i]);
        }
        System.out.println(a[a.length - 1]);
        for (int i = 0; i < a.length; i++) {
            System.out.printf("%3d   ", i);
        }
        System.out.println();
    }
    // Aufgabe 3
    public static int quersummeBerechnen(int n){
        int quersumme = 0;
        while(n > 0) {
            quersumme += n % 10;
            System.out.println("nach n % 10: " + n);
            n = n / 10;
            System.out.println("nach n = n /10: "+ n);
        }
        System.out.println(quersumme);
        return quersumme;
    }
    //public static int summiereArray(int[] array){
    //    for (int i = 0; i < array.length; i++) {
    //        int ergebis = array[i];
    //    }
    //}







}
