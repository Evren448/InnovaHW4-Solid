package com.company.interfacesegregation;

public class Cat implements Runnable{
    @Override
    public void run() {
        System.out.println("Cat is running.");
    }
}
