package com.sagar.string;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SeniorMostPersonTest {

    @Test
    public void testGetSeniorMostPerson() {
        // Test case 1
        String input1 = "MK GANDHI-18691002,J Nehru-18891114,LB SHASTRI-19041002";
        String expected1 = "MK GANDHI";
        assertEquals(expected1, SeniorMostPerson.getSeniorMostPerson(input1));

        // Test case 2
        String input2 = "A Person-19900101,B Person-19800101,C Person-20000101";
        String expected2 = "B Person";
        assertEquals(expected2, SeniorMostPerson.getSeniorMostPerson(input2));

        // Test case 3
        String input3 = "Person1-20010101,Person2-20020101,Person3-20030101";
        String expected3 = "Person1";
        assertEquals(expected3, SeniorMostPerson.getSeniorMostPerson(input3));
        
        // Test case 4: Edge case with same DOBs
        String input4 = "PersonA-19900101,PersonB-19900101";
        String expected4 = "PersonA";
        assertEquals(expected4, SeniorMostPerson.getSeniorMostPerson(input4));

        // Test case 5: Single entry
        String input5 = "Only Person-19700101";
        String expected5 = "Only Person";
        assertEquals(expected5, SeniorMostPerson.getSeniorMostPerson(input5));
    }
}
