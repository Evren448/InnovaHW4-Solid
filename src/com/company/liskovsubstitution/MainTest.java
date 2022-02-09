package com.company.liskovsubstitution;

public class MainTest {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(10, 5);
        System.out.println("Rectangle area: " + rectangle.area());

        Shape square = new Square(5);
        System.out.println("Square area: " + square.area());
    }
}
