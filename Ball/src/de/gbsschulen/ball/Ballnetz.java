package de.gbsschulen.ball;

public class Ballnetz {
    protected Ball [] baelle;
    protected int maxAnzahlBaelle;
    protected int anzahlBaelle;

    public Ballnetz(int maxAnzahlBaelle) {
        this.baelle = new Ball[maxAnzahlBaelle];
        this.maxAnzahlBaelle = maxAnzahlBaelle;
        this.anzahlBaelle = 0;
    }
    public boolean istVoll(){
        return anzahlBaelle >= baelle.length;
    }
    public boolean istLeer(){
        return anzahlBaelle == 0;
    }
    
    public boolean hinzufuegen(Ball ball){
        if(anzahlBaelle < baelle.length){
            baelle[anzahlBaelle] = ball;
            anzahlBaelle++;
            return true;
        }
        System.out.println("Maximale Anzahl der Bälle ist: " + maxAnzahlBaelle);
        return false;
    }

    public Ball entfernen(int i){
        if(i <= 0) {
            System.out.println("Falscher Index");
            return null;
        }
        this.anzahlBaelle--;
        Ball entfernterBall = baelle[i];
        return entfernterBall;
    }

    public void druckeBall(int i){
        if (i < 0 && i > baelle.length){
            System.out.println("Falscher Index");
        }
        Ball ball = baelle[i];
        ball.druckeInfo();
    }

}
