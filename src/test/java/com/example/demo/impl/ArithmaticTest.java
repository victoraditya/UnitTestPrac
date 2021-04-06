package com.example.demo.impl;

import org.junit.jupiter.api.Test;
import org.skyscreamer.jsonassert.JSONAssert;

import static org.junit.jupiter.api.Assertions.*;

class ArithmaticTest {

    @Test
    void sumArray() {
        Arithmatic arithmatic = new Arithmatic();
        int result=arithmatic.sumArray(new int[]{1,2,3});
        assertEquals(result,6);
    }
}