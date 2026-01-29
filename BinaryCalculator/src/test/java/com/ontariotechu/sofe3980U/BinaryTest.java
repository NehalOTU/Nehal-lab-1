package com.ontariotechu.sofe3980U;

import org.junit.Test;
import static org.junit.Assert.*;

public class BinaryTest {

    @Test
    public void testAdd() {
        assertEquals("10000", Binary.add(new Binary("1010"), new Binary("0110")).getValue());
    }

    @Test
    public void testOr() {
        assertEquals("1110", Binary.or(new Binary("1010"), new Binary("0110")).getValue());
    }

    @Test
    public void testAnd() {
        assertEquals("0010", Binary.and(new Binary("1010"), new Binary("0110")).getValue());
    }

    @Test
    public void testMultiply() {
        assertEquals("111100", Binary.multiply(new Binary("1010"), new Binary("0110")).getValue());
    }
}
