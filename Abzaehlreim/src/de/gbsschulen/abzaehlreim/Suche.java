package de.gbsschulen.abzaehlreim;

import java.lang.reflect.Array;

public class Suche {
    protected int[] test;


    // Lineare Suche
    public static int lineareSuche(int[] a, int key) {
        int i;
        for (i = 0; i < a.length && a[i] != key; i++) ;
        if (i == a.length) {
            return -1;
        } else {
            return i;
        }
    }
    // Variante 2
    public static int lineareSuche2(int[] a, int key) {
        for (int i = 0; i <= a.length  ; i ++ ) {
            if ( a[i] == key ) {
                return i;
            }
        }
        return -1;
    }

    public static int binaereSuche(int [ ] a, int key) {
        int links = 0;
        int rechts = a.length -1;
        int mitte = (links + rechts) /2;
        while (links <= rechts && a [mitte] != key) {
            if (a [mitte] < key) {
                links = mitte +1;
            } else {
                rechts = mitte -1;
            }
            mitte = (links + rechts) /2;
        }
        if ( links > rechts) {
            return - (links +1);
        }
        return mitte;
    }

    public static boolean doppelteVorkommen(int[]a){
        for (int i = 0; i < a.length -1; i++) {
            for ( int j = i + 1; j < a.length; j++) {
                if ( a[i] == a[j]) {
                    return true;
                }
            }
        }
    return false;
    }
    // geschicktere Variante
    public static boolean doppelte(int[]a) {
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] == a[i + 1]) {
                return true;
            }
        }
        return false;
    }

    // Minimumsuche
    public static int minimum(int[]a) {
        int aktuelleMin = a[0];
        int aktellePos = 0;
        for (int i = 1; i < a.length; i++) {
            if (a[i] < aktuelleMin) {
                aktuelleMin = a[i];
                aktellePos = i;
            }
        }
        return aktellePos;
    }
}
