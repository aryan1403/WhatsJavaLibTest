package com.example;

import java.util.concurrent.ExecutionException;
import it.auties.whatsapp.api.Whatsapp;
public class App 
{
    public static void main(String... args)
    {
        try {
            var api = Whatsapp.newConnection().connect().get();
            api.sendMessage(chat, message, contextInfo);
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
    }
}
