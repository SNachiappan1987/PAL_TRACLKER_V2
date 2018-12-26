package io.pivotal.pal.tracker;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class ApplicationController {


    @Value("${WELCOME_MESSAGE}")
    String welcomeMessage ;

    public ApplicationController(String welcomeMessage) {
        this.welcomeMessage = welcomeMessage;
    }

    public ApplicationController() {
        this.welcomeMessage = welcomeMessage;
    }


    @GetMapping("/")
    public String sayHello(){
        return welcomeMessage;
    }
}
