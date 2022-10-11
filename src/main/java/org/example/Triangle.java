package org.example;

import java.util.Scanner;

public class Triangle {
    private int a;
    private int b;
    private int c;

    public Triangle() {
    }

    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public String determineType() {
        String type = "";
        if(a >= (b+c) || c >= (b+a) || b >= (a+c) ) {
            type = "not a triangle";
            System.out.println(type);
        } else if(a==b && b==c) {
            type = "equilateral triangle";
            System.out.println(type);
        } else if (((a * a) + (b * b)) == (c * c) || ((a * a) + (c * c)) == (b * b) || ((c * c) + (b * b)) == (a * a)) {
            type = "right triangle";
            System.out.println(type);
        } else if(a!=b && b!=c && c!=a) {
            type = "scalene triangle";
            System.out.println(type);
        } else if ((a==b && b!=c ) || (b==c && c!=a) || (c==a && a!=b)) {
            type = "isosceles triangle";
            System.out.println(type);
        }
        return type;
    }

    public static void main(String [] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите стороны треугольника");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        Triangle t = new Triangle(a, b, c);
        t.determineType();
    }
}