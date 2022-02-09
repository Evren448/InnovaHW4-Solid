package com.company.dependencyinversion;

import java.util.ArrayList;
import java.util.List;

public class MainTest {
    public static void main(String[] args) {

        List<Message> messageList = new ArrayList<>();

        Message email = new Email();
        Message sms = new SMS();

        messageList.add(email);
        messageList.add(sms);

        Notification notification = new Notification(messageList);
        notification.sender();
    }
}
