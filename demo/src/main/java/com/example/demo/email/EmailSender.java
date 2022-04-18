package com.example.demo.email;

public interface EmailSender { // we have an interface so that we can switch implementations

    void send(String to, String email);


}
