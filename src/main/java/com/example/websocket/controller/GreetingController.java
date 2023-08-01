package com.example.websocket.controller;


import com.example.websocket.model.Greeting;
import com.example.websocket.model.HelloMessage;
import org.springframework.stereotype.Controller;
import org.springframework.web.util.HtmlUtils;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
@Controller
public class GreetingController {

    @MessageMapping("/hello") //=> Bu anatasyon, "/hello yolundaki mesajları işlemek için kullanılan yöntemi belirtir.
    //İstemci /hello yoluyla bir mesaj gönderdiğinde, bu yöntem mesaji işleyecek ve yanıt olarak Greeting nesnesi döndürecek.
    @SendTo("/topic/greetings") //=> Bu anatasyon, "greeting() yöntemi tarafından döndürülen "Greeting" nesnesini /topic/greetings
    //yoluna yayınlar. Bu bağlı olan tüm WebSocket istemcilerine bu mesajın gönderileceği anlamına gelir.
    public Greeting greeting(HelloMessage message) throws Exception {
        Thread.sleep(1000); // simulated delay
        return new Greeting("Hello, " + HtmlUtils.htmlEscape(message.getName()) + "!");
    }


}
