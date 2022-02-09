package com.company.openclosed;

public class MainTest {
    public static void main(String[] args) {

        AreaManager areaManager = new AreaManager();

        Shape circle = new Circle(2);
        System.out.println( areaManager.calculateArea(circle));

        Shape rectangle = new Rectangle(2,3);
        System.out.println( areaManager.calculateArea(rectangle));
    }
}
