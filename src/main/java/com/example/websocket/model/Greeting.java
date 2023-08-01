package com.example.websocket.model;
//Bu sınıf, WebSocket üzerinden iletilen selamlama mesajlarını temsil eden basit bir model sınıfıdır.
public class Greeting {


    private String content;

    public Greeting(){}

    public Greeting(String content)
    {
        this.content=content;
    }

    public void setContent(String content)
    {
        this.content=content;
    }

    public String getContent()
    {
        return content;
    }

}
