package de.gbsschulen.ball;

public class Ballnetz {
    private Ball [] baelle;
    private int maxAnzahlBaelle;
    private int anzahlBaelle;

    public Ballnetz(int maxAnzahlBaelle) {
        this.baelle = new Ball[maxAnzahlBaelle];
        this.maxAnzahlBaelle = maxAnzahlBaelle;
    }
    
    public boolean hinzufuegen(Ball ball){
        for (int i = 0; i < maxAnzahlBaelle; i++) {
            baelle[i] = ball;
            return true;
        }
        System.out.println("Maximale Anzahl der Bälle ist: " + maxAnzahlBaelle);
        return false;
    }

    public Ball entfernen (int i){
        Ball zuEntfernenderBall = baelle[i];
        if (i < 0 && i > baelle.length){
            System.out.println("Falscher Index");
            return null;
        }
        return zuEntfernenderBall;
    }

    public void druckeBall(int i){
        if (i < 0 && i > baelle.length){
            System.out.println("Falscher Index");
        }
        Ball ball = baelle[i];
        ball.druckeInfo();
    }

}
