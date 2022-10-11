package org.example;

import org.junit.Test;

import static org.junit.Assert.*;

public class TriangleTest {
    public Triangle createTriangle(int a, int b, int c) {
        return new Triangle(a,b,c);
    }

    @Test
    public void test() {
        assertEquals(createTriangle(1,1,1).determineType(),"equilateral triangle");
        assertEquals(createTriangle(1,1,5).determineType(),"not a triangle");
        assertEquals(createTriangle(1,5,5).determineType(),"isosceles triangle");
        assertEquals(createTriangle(5,5,5).determineType(),"equilateral triangle");
        assertEquals(createTriangle(5,15,20).determineType(),"not a triangle");
        assertEquals(createTriangle(15,15,20).determineType(),"isosceles triangle");
        assertEquals(createTriangle(15,20,30).determineType(),"scalene triangle");
        assertEquals(createTriangle(49,49,30).determineType(),"isosceles triangle");
        assertEquals(createTriangle(20,49,100).determineType(),"not a triangle");
        assertEquals(createTriangle(100,20,1).determineType(),"not a triangle");
        assertEquals(createTriangle(3,4,5).determineType(),"right triangle");
    }

    @Test
    public void test2() {
        assertEquals(createTriangle(1,1,5).determineType(), "not a triangle");
        assertEquals(createTriangle(1,5,5).determineType(), "isosceles triangle");
        assertEquals(createTriangle(5,15,20).determineType(), "not a triangle");
        assertEquals(createTriangle(15,15,20).determineType(), "isosceles triangle");
        assertEquals(createTriangle(15,20,30).determineType(), "scalene triangle");
        assertEquals(createTriangle(49,49,30).determineType(), "isosceles triangle");
        assertEquals(createTriangle(20,49,100).determineType(), "not a triangle");
        assertEquals(createTriangle(100,20,1).determineType(), "not a triangle");
        assertEquals(createTriangle(4,5,3).determineType(), "right triangle");
    }
    @Test
    public void test3() {
        assertEquals(createTriangle(1,5,1).determineType(), "not a triangle");
        assertEquals(createTriangle(5,5,1).determineType(), "isosceles triangle");
        assertEquals(createTriangle(15,20,5).determineType(), "not a triangle");
        assertEquals(createTriangle(15,20,15).determineType(), "isosceles triangle");
        assertEquals(createTriangle(20,30,15).determineType(), "scalene triangle");
        assertEquals(createTriangle(49,30,49).determineType(), "isosceles triangle");
        assertEquals(createTriangle(49,100,20).determineType(), "not a triangle");
        assertEquals(createTriangle(20,1,100).determineType(), "not a triangle");
        assertEquals(createTriangle(5,3,4).determineType(), "right triangle");
    }
}