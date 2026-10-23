
package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class EvenOddTest {

    @Test
    void testEvenNumber() {
        assertTrue(EvenOdd.isEven(4));
    }

    @Test
    void testOddNumber() {
        assertTrue(EvenOdd.isEven(7));
    }

    @Test
    void testZeroIsEven() {
        assertTrue(EvenOdd.isEven(0));
    }
}

