package com.sabel.array.Temperaturmessung;

public class Temperaturmessung {
    public static void main(String[] args) {
        double [] messwerte = new double[365];
        // für Winter;
        for (int i = 0; i < 90; i++) {
            messwerte[i] = generiereZufallstemperatur(-30,0);
        }
        // für Frühlung
        for (int i = 90; i < 180; i++) {
            messwerte[i] = generiereZufallstemperatur(0, 10);
        }
        // für Sommer
        for (int i = 180; i < 270; i++) {
            messwerte[i] = generiereZufallstemperatur(10, 30);
        }
        // für Herbst
        for (int i = 270; i < 365; i++) {
            messwerte[i] = generiereZufallstemperatur(0,10);
        }
        druckeMesswserte(messwerte);
    }

    public static double generiereZufallstemperatur(){
        double wert = Math.random()* 60;   // 0.0 bis 59.9999999
        wert -= 30;
        return wert;
    }
    public static double generiereZufallstemperatur(int min, int max){
        return Math.random() * (max - min) + min;
    }

    public static double berechneMaxTemp(double [] messwerte){
        double max = messwerte[0];
        int position = 0;
        for (int i = 0; i < messwerte.length; i++) {
            if(messwerte[i] > max){
                max = messwerte[i];
                position = i;
            }
        }
        return position;
    }
    public static void druckeMesswserte(double[] messwerte){
        for (double messwert : messwerte){
            System.out.println(messwert);
        }
    }


}
