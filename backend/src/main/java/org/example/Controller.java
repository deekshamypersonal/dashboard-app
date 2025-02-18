package org.example;


import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:5173")
public class Controller {

    private final UserInteractionService interactionService;

    public Controller(UserInteractionService interactionService) {
        this.interactionService = interactionService;
    }


    @GetMapping("/hello")
    public String sayHello() {
        return "Hello, World!";
    }

    @GetMapping("/producer/enroll")
    public String enrollNow() {
        interactionService.enrollNowClicked();
        System.out.println("Enroll event recorded.");
        return "Enroll event recorded.";
    }

    @GetMapping("/producer/pay")
    public String payNow() {
        interactionService.payNowClicked();
        System.out.println("Pay event recorded.");
        return "Pay event recorded.";
    }
}
