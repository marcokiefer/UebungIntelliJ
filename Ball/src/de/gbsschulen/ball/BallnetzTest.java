package de.gbsschulen.ball;

import org.junit.Test;

import static org.junit.Assert.*;

public class BallnetzTest {
    private Ballnetz testBallnetz;

    @Test
    public void konstruktorTestBallNetz(){
        testBallnetz = new Ballnetz(5);
        assertNotNull(testBallnetz);
    }

    @Test
    public void hinzufuegenTest(){
        testBallnetz = new Ballnetz(5);
        Ball ball = new Ball(25);
        boolean result = testBallnetz.hinzufuegen(ball);
        assertEquals(1,testBallnetz.anzahlBaelle);
        assertNotNull(testBallnetz.baelle[0]);
    }

    @Test
    public void entferneBall(){
        testBallnetz = new Ballnetz(4);
        Ball ball = new Ball(35);
        testBallnetz.hinzufuegen(ball);
        assertEquals(1,testBallnetz.anzahlBaelle);
        testBallnetz.entfernen(0);
    }


}