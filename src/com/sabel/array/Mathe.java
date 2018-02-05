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
        int[] quadrat = new int[20];
        for (int i = 0; i < quadrat.length; i++) {
            quadrat[i] = i * i;
        }
        druckeArray(quadrat);
        int n = 123;
        System.out.println("Quersumme von " + n + " = " + quersumme(n));
        int[] quersumme = new int[50];
        for (int i = 0; i < quersumme.length; i++) {
            quersumme[i] = quersumme(i);
        }
        druckeArray(quersumme);
        // Aufgabe 6
        System.out.println("Mittelwert von Quersumme: "+berechneMittelwert(quersumme));
        System.out.println("Mittelwert von Quadrat: " +berechneMittelwert(quadrat));
        // Aufgabe 7
        int pos = berechneMaxWert(quadrat);
        System.out.println("Maximalwert Position: "+ pos + " Wert: " + quadrat[pos]);
        pos = berechneMaxWert(quersumme);
        System.out.println("Maximalwert Position: " + pos + " Wert: " + quersumme[pos]);
    }

    public static void druckeArray(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.printf("%3d  ", a[i]);
        }
        System.out.println();
        for (int i = 0; i < a.length; i++) {
            System.out.printf("%3d  ", i);
        }
        System.out.println();
    }

    public static int quersumme(int n){
        int quersumme = 0;
        while(n > 0) {
            quersumme += n % 10;
            n = n / 10;
        }
        return quersumme;
    }

    public static int summeArray(int[] array){
        int summe = 0;
        for (int i = 0; i < array.length; i++) {
            summe += array[i];
        }
        return summe;
    }

    public static double berechneMittelwert(int [] array) {
        int summe = summeArray(array);
        return (double)summe / array.length;
    }

    public static int berechneMaxWert(int [] array){
        int max = array[0];
        int position = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max){
                max = array[i];
                position = i;
            }
        }
        return position;
    }




}
