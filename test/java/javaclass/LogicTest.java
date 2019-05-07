package javaclass;

import org.junit.Test;

import static org.junit.Assert.*;

public class LogicTest {

    @Test
    public void testCheckDiscriminant(){
        Logic testLogic = new Logic(-1,-2,15);
        //-1	-2	15	64	-	-5	3
        int D = 64;
        int x1 = -5;
        int x2 = 3;
        assertTrue(D == testLogic.getD());
        assertTrue(x1 == testLogic.getX1());
        assertTrue(x2 == testLogic.getX2());
    }
}