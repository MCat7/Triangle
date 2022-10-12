package org.example;


import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.List;

import static org.junit.runners.Parameterized.*;

@RunWith(Parameterized.class)
public class TriangleUpdTest extends Assert {
    private int a;
    private int b;
    private int c;
    private String expected;

    public TriangleUpdTest(int a, int b, int c, String expected) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.expected = expected;
    }

    @Test
    public void testTriangle() {
        assertEquals(expected, new Triangle(a, b, c).determineType());
    }

    @Parameters
    public static List<Object[]> dataForTest() {
        return Arrays.asList(new Object[][]{
                {1, 1, 1, "equilateral triangle"},
                {1, 1, 5, "not a triangle"},
                {1, 5, 5, "isosceles triangle"},
                {5, 5, 5, "equilateral triangle"},
                {5, 15, 20, "not a triangle"},
                {15, 15, 20, "isosceles triangle"},
                {15, 20, 30, "scalene triangle"},
                {49, 49, 30, "isosceles triangle"},
                {20, 49, 100, "not a triangle"},
                {100, 20, 1, "not a triangle"},
                {3, 4, 5, "right triangle"},

                {1, 1, 5, "not a triangle"},
                {1, 5, 5, "isosceles triangle"},
                {5, 15, 20, "not a triangle"},
                {15, 15, 20, "isosceles triangle"},
                {15, 20, 30, "scalene triangle"},
                {49, 49, 30, "isosceles triangle"},
                {20, 49, 100, "not a triangle"},
                {100, 20, 1, "not a triangle"},
                {4, 5, 3, "right triangle"},

                {1, 5, 1, "not a triangle"},
                {5, 5, 1, "isosceles triangle"},
                {15, 20, 5, "not a triangle"},
                {15, 20, 15, "isosceles triangle"},
                {20, 30, 15, "scalene triangle"},
                {49, 30, 49, "isosceles triangle"},
                {49, 100, 20, "not a triangle"},
                {20, 1, 100, "not a triangle"},
                {5, 3, 4, "right triangle"},

        });
    }
}
