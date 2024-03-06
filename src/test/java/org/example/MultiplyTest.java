package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MultiplyTest {
    Multiply m = new Multiply();
    @Test
    void multiply() {
        assertEquals(4,m.multiply(2,2));
    }
}