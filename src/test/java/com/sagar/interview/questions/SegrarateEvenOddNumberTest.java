package com.sagar.interview.questions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SegrarateEvenOddNumberTest {

    @Test
    public void testMixedEvenOdd() {
        int[] input = {1, 25, 6, 0, 23, 9, 10, 28, 8};
        int[] expected = {6, 0, 10, 28, 8, 1, 25, 23, 9};
        SegregateEvenOddNumber.segregateEvenOdd(input);
        assertArrayEquals(expected, input);
    }
    @Test
    public void testAllEven() {
        int[] input = {2, 4, 6, 8, 10};
        int[] expected = {2, 4, 6, 8, 10};
        SegregateEvenOddNumber.segregateEvenOdd(input);
        assertArrayEquals(expected, input);
    }

    @Test
    public void testAllOdd() {
        int[] input = {1, 3, 5, 7, 9};
        int[] expected = {1, 3, 5, 7, 9};
        SegregateEvenOddNumber.segregateEvenOdd(input);
        assertArrayEquals(expected, input);
    }

    @Test
    public void testEmptyArray() {
        int[] input = {};
        int[] expected = {};
        SegregateEvenOddNumber.segregateEvenOdd(input);
        assertArrayEquals(expected, input);
    }

    @Test
    public void testSingleElementEven() {
        int[] input = {2};
        int[] expected = {2};
        SegregateEvenOddNumber.segregateEvenOdd(input);
        assertArrayEquals(expected, input);
    }

    @Test
    public void testSingleElementOdd() {
        int[] input = {3};
        int[] expected = {3};
        SegregateEvenOddNumber.segregateEvenOdd(input);
        assertArrayEquals(expected, input);
    }

    @Test
    public void testAlreadySegregated() {
        int[] input = {2, 4, 6, 1, 3, 5};
        int[] expected = {2, 4, 6, 1, 3, 5};
        SegregateEvenOddNumber.segregateEvenOdd(input);
        assertArrayEquals(expected, input);
    }

}
