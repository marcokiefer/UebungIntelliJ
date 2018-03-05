package de.gbsschulen.ball;

public class Testklasse {
    public static void main(String[] args) {
        Ball ball = new Ball(80);
        Ballnetz ballnetz = new Ballnetz(5);
        ballnetz.hinzufuegen(ball);
        ballnetz.druckeBall(0);
    }
}
