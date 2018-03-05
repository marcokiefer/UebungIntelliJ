package de.gbsschulen.ball;

import org.junit.Test;

import static org.junit.Assert.*;

public class BallTest {
    private Ball testBall;

    @Test
    public void konstruktorTest(){
        testBall = new Ball(80);
        assertNotNull(testBall);
        assertNotNull(testBall.getAktuelleFuellmenge());
    }

    @Test
    public void aufpumpenTest(){
        testBall = new Ball(50);
        testBall.aufpumpen(12);
        assertNotNull(testBall);
        System.out.println(testBall.getAktuelleFuellmenge());
    }

    @Test
    public void aufpumpenTestHigherThenMax(){
        testBall = new Ball(45);
        testBall.aufpumpen(55);
        assertEquals(45, testBall.getAktuelleFuellmenge(), 0.0001);
    }




}