package com.company.interfacesegregation;

public class Bird implements Flyable{
    @Override
    public void fly() {
        System.out.println("Bird is flying");
    }
}
