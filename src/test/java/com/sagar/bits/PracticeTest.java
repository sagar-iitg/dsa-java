package com.sagar.bits;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PracticeTest {

    @Test
    public void testShiftRight() {
        assertEquals(5, Practice.shiftRight(10), "10 >> 1 should be 5");
        assertEquals(2, Practice.shiftRight(5), "5 >> 1 should be 2");
        assertEquals(0, Practice.shiftRight(1), "1 >> 1 should be 0");
        assertEquals(-1, Practice.shiftRight(-1), "-1 >> 1 should be -1");
        assertEquals(-5, Practice.shiftRight(-10), "-10 >> 1 should be -5");
    }
}
