package com.example.emailapp.email;


//It is good to have interfaces because it is useful to change implementations
public interface EmailSender {
    void send(String to, String email);
}

