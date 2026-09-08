/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.university.lab.labtask1;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author waleeja
 */
public class StringPerformanceTest {

    @Test
    public void testBuildStringOutput() {
        int n = 5;
        String expected = "012345";
        assertEquals(expected, stringperformance.buildString(n));
    }

    @Test
    public void testBuildStringBuilderOutput() {
        int n = 5;
        
        String expected = "012345";
        assertEquals(expected, stringperformance.buildStringBuilder(n));
    }

    @Test
    public void testBothMethodsProduceIdenticalResults() {
        int n = 100;
        String stringResult = stringperformance.buildString(n);
        String builderResult = stringperformance.buildStringBuilder(n);

        assertEquals(stringResult, builderResult, "Both methods must return identical concatenated strings.");
    }
}
