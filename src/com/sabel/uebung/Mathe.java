package com.sabel.uebung;

public class Mathe {

    public static double summe(double[]a){
        double summe = 0.0;
        for (double temp : a){
            summe += temp;
        }
        System.out.println(summe);
        return summe;
    }

    public static void main(String[] args) {
        double [] werte;
        werte = new double[12];
        werte[0] = 10.4;
        werte[1] = 15.2;
        werte[2] = 25.2;
        Mathe.summe(werte);

    }
}
