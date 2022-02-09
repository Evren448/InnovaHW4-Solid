package com.company.dependencyinversion;

public class Email implements Message{
    @Override
    public void sendMessage() {
        sendEmail();
    }

    private void sendEmail() {
        System.out.println("Email send.");
    }
}
