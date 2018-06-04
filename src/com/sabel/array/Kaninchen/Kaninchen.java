package com.sabel.array.Kaninchen;

public class Kaninchen {
    public static void main(String[] args) {
        System.out.println("Anzahl der Paare: "+ anzahlPaare(7));
        int[] bla = liefereFib(8);
        for (int i = 0; i < bla.length; i++) {
            System.out.println(bla[i]);
        }
    }

    public static int anzahlPaare(int monate){
        int anzahl = 0;
        int vorMonate = 1;
        int vorVorMonat = 1;

        if (monate == 0 || monate == 1) {
            return 1;
        } else {
                for (int i = 2; i <= monate; i++) {
                    anzahl = vorMonate + vorVorMonat;
                    vorVorMonat = vorMonate;
                    vorMonate = anzahl;
            }
        }
        return anzahl;
    }

    public static int[] liefereFib(int monate){
        int [] fib = new int[monate + 1];
        fib[0] = 1;
        fib[1] = 1;
        for (int i = 2; i <= monate; i++) {
            fib[i] = fib[i-1] + fib[i-2];
        }
        return fib;
    }

}

