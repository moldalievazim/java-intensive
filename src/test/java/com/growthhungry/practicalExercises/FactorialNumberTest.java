package com.growthhungry.practicalExercises;

//import org.junit.Test;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class FactorialNumberTest {

    @Test
    void testFactorial() {
        assertEquals(1, FactorialNumber.getFactorial(0));
        assertEquals(1, FactorialNumber.getFactorial(1));
        assertEquals(2, FactorialNumber.getFactorial(2));
        assertEquals(6, FactorialNumber.getFactorial(3));
        assertEquals(120, FactorialNumber.getFactorial(5));
    }
}