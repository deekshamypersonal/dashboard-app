//package org.example;
//
////import org.springframework.kafka.annotation.KafkaListener;
////import org.springframework.stereotype.Service;
////
////@Service
////public class SimpleConsumer {
////
////    @KafkaListener(topics = "test-topic", groupId = "test-group")
////    public void consume(String message) {
////        System.out.println("Received message: " + message);
////    }
////}
//
//import io.prometheus.client.Counter;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.kafka.annotation.KafkaListener;
//import org.springframework.stereotype.Service;
//
//@Service
//public class EventConsumer {
//
//    @Autowired
//    private final UserInteractionService interactionService;
//
//
//
////    private final Counter enrollCounter;
////    private final Counter payCounter;
//
//    public EventConsumer(UserInteractionService interactionService) {
//        this.interactionService = interactionService;
////        enrollCounter = Counter.build()
////                .name("enroll_events_total")
////                .help("Total number of Enroll Now events")
////                .register();
////
////        payCounter = Counter.build()
////                .name("pay_events_total")
////                .help("Total number of Pay Now events")
////                .register();
//    }
//
//    @KafkaListener(topics = "user-events", groupId = "metrics-consumer-group")
//    public void listen(String eventData) {
//        if (eventData.contains("Enroll Now")) {
////            enrollCounter.inc();
//            interactionService.enrollNowClicked();
//            System.out.println("Enroll event consumed: " + eventData);
//        } else if (eventData.contains("Pay Now")) {
//            //payCounter.inc();
//            interactionService.payNowClicked();
//            System.out.println("Pay event consumed: " + eventData);
//        }
//    }
//}
