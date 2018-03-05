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


}