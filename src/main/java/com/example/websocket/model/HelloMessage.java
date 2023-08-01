package com.example.websocket.model;
//Bu sınıf, WebSocket üzerinden gönderilen "Merhaba" mesajını temsil eden basit bir model sınıfıdır.
public class HelloMessage {

private String name;

public HelloMessage(){}

    public HelloMessage(String name)
    {
        this.name=name;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name=name;
    }


}
