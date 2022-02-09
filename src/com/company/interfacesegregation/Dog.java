package com.company.interfacesegregation;

public class Dog implements Barkable, Runnable{
    @Override
    public void bark() {
        System.out.println("Dog is barking.");
    }

    @Override
    public void run() {
        System.out.println("Dog is running.");
    }
}
