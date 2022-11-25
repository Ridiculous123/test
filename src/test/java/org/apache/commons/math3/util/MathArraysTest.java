package org.apache.commons.math3.util;

import org.junit.Test;

import static org.junit.Assert.*;

public class MathArraysTest {
    @Test
    public void testScale() {
        double [] a = {1, 2, 3, 4, 5};
        double [] s;
        s = MathArrays.scale(3, a);
        assertArrayEquals(new double[] {3, 6, 9, 12, 15}, s, 0.0001);
    }

    @Test
    public void testEbeAdd() {
        double [] a = {1, 2, 3, 4, 5};
        double [] b = {1, 2, 3, 4, 5};
        double [] s;
        s = MathArrays.ebeAdd(a, b);
        assertArrayEquals(new double[] {2, 4, 6, 8, 10}, s, 0.0001);
    }

    @Test
    public void testDistance1() {
        double [] p1 = {1, 2, 3, 4, 5};
        double [] p2 = {2, 3, 4, 5, 6};
        double s;
        s = MathArrays.distance1(p1, p2);
        assertEquals(5, s, 0.0001);
    }
}