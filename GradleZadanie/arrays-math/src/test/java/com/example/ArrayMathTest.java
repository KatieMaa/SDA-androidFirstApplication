package com.example;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by RENT on 2017-03-27.
 */
public class ArrayMathTest {

    @org.junit.Test
    public void throwException () throws Exception {
        int[] numbers = {12,32,4,56};
        ArrayMath.max(new int[0]);
    }

    @Test
    public void findMax() {
        assertEquals(ArrayMath.max(new int[]{1,2,3,4,5,45}), 45);
        assertEquals(ArrayMath.max(new int[]{1,-2,3,4,-5,45}), 45);
    }
}