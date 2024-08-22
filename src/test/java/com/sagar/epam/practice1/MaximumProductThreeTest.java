package com.sagar.epam.practice1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MaximumProductThreeTest {

    private MaximumProductThree obj;  // Declare the object

    @BeforeEach
    void setUp() {
        obj = new MaximumProductThree();  // Initialize the object before each test
    }
    @Test
    void testPositiveNumbers() {
        //MaximumProductThree obj = new MaximumProductThree();
        int[] arr = {1, 10, 2, 6, 5, 3};
        int result = obj.maxProductOfThree(arr);
        assertEquals(300, result, "The product of {10, 6, 5} should be 300");
    }

    @Test
    void testNegativeAndPositiveNumbers() {
        //MaximumProductThree obj = new MaximumProductThree();
        int[] arr = {-10, -10, 5, 2};
        int result = obj.maxProductOfThree(arr);
        assertEquals(500, result, "The product of {-10, -10, 5} should be 500");
    }

    @Test
    void testAllNegativeNumbers() {
       // MaximumProductThree obj = new MaximumProductThree();
        int[] arr = {-1, -2, -3, -4};
        int result = obj.maxProductOfThree(arr);
        assertEquals(-6, result, "The product of {-1, -2, -3} should be -6");
    }

    @Test
    void testMixedNumbers() {
        //MaximumProductThree obj = new MaximumProductThree();
        int[] arr = {-10, -1, 0, 1, 2, 3};
        int result = obj.maxProductOfThree(arr);
        assertEquals(30, result, "The product of {3, 2, -10} should be 30");
    }

    @Test
    void testSmallArray() {
        //MaximumProductThree obj = new MaximumProductThree();
        int[] arr = {1, 2, 3};
        int result = obj.maxProductOfThree(arr);
        assertEquals(6, result, "The product of {1, 2, 3} should be 6");
    }

    @Test
    void testLargerNumbers() {
        //MaximumProductThree obj = new MaximumProductThree();
        int[] arr = {-100, 100, 10, 5, 1};
        int result = obj.maxProductOfThree(arr);
        assertEquals(5000, result, "The product of {100, 10, 5} should be 5000");
    }
}
