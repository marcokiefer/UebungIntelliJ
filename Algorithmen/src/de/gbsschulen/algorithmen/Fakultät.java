package de.gbsschulen.algorithmen;

// Aufgabenblatt Algorithmen und Datenstrukturen
// Übungsbaltt 3

public class Fakultät {

    public static void main(String[] args) {
        int n =8;
        System.out.println("Fakultät positiv: "+ fakultaet(n));
        System.out.println("Fakultät Iteration positiv: "+ fakultaetIteration(n));
        System.out.println(potenzRekursiv(2,0));
        System.out.println(anzahlBlueten(1));
        System.out.println(anzahlBluetenIteration(1));
    }

    // Aufgabe 1
    public static int anzahlBlueten(int n){
        if (n==1 || n==0){
            return 1;
        }
        return anzahlBlueten(n-2)+anzahlBlueten(n-1);
    }
    public static int anzahlBluetenIteration(int n){
        int erg = 1;
        int aVormonat=1;
        int aVorVormonat=1;
        for(int i=2; i <=n; i++){
            erg = aVorVormonat + aVormonat;
            aVorVormonat = aVormonat;
            aVormonat = erg;
        }
        return erg;
    }

    public static int fakultaet(int n){
        if(n == 0){
            return 1;
        }
        return n * fakultaet(n-1);
    }
    public static int fakultaetIteration(int n){
        int erg = 1;
        for (int i = 1; i <= n; i++) {
            erg = erg *i;
        }
        return erg;
    }

    public static int potenzRekursiv(int basis, int exponet){
        int erg = 0;
        if (exponet == 0){
            return 1;
        }
        if (exponet==1) {
            return basis;
        } else {
            return erg = basis*potenzRekursiv(basis,exponet-1);
        }
    }




}
