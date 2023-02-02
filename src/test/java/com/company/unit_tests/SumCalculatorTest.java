package com.company.unit_tests;

import org.junit.jupiter.api.*;

class SumCalculatorTest {

    private SumCalculator sumCalculator;

    @BeforeEach
    public void beforeEach() {
        sumCalculator = new SumCalculator();
    }

    @Test
    public void testThatSum1CorrectlyHandled() {
        int actual = sumCalculator.sum(1);
        Assertions.assertEquals(1, actual);
    }

    @Test
    public void testThatSum3CorrectlyHandled() {
        int actual = sumCalculator.sum(3);
        Assertions.assertEquals(6, actual);
    }

    @Test
    public void testThatSum0orLessCorrectlyHandled() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> sumCalculator.sum(0));
    }
}