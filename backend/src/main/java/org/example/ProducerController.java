//package org.example;
//
////import org.apache.kafka.clients.producer.KafkaProducer;
////import org.apache.kafka.clients.producer.ProducerRecord;
////import org.springframework.web.bind.annotation.*;
////
////import java.util.Properties;
////
////@RestController
////@RequestMapping("/producer")
////public class SimpleProducerController {
////
////    private final KafkaProducer<String, String> kafkaProducer;
////    private static final String TOPIC = "test-topic"; // Replace with your Kafka topic name
////    private static final String BOOTSTRAP_SERVERS = "localhost:9092"; // Kafka broker address
////
////    public SimpleProducerController() {
////        Properties props = new Properties();
////        props.put("bootstrap.servers", BOOTSTRAP_SERVERS);
////        props.put("key.serializer", "org.apache.kafka.common.serialization.StringSerializer");
////        props.put("value.serializer", "org.apache.kafka.common.serialization.StringSerializer");
////
////        this.kafkaProducer = new KafkaProducer<>(props);
////    }
////
////    @PostMapping("/send")
////    public String sendMessage(@RequestBody String message) {
////        ProducerRecord<String, String> record = new ProducerRecord<>(TOPIC, "key", message);
////        kafkaProducer.send(record);
////        return "Message sent to Kafka topic: " + TOPIC;
////    }
////}
//
//import org.apache.kafka.clients.producer.KafkaProducer;
//import org.apache.kafka.clients.producer.ProducerRecord;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.Properties;
//
//@RestController
//@RequestMapping("/producer")
//public class SimpleProducerController {
//
//    private final KafkaProducer<String, String> kafkaProducer;
//    private static final String TOPIC = "user-events"; // Kafka topic
//    private static final String BOOTSTRAP_SERVERS = "localhost:9092";
//
//    public SimpleProducerController() {
//        Properties props = new Properties();
//        props.put("bootstrap.servers", BOOTSTRAP_SERVERS);
//        props.put("key.serializer", "org.apache.kafka.common.serialization.StringSerializer");
//        props.put("value.serializer", "org.apache.kafka.common.serialization.StringSerializer");
//        this.kafkaProducer = new KafkaProducer<>(props);
//    }
//
////    @PostMapping("/enroll")
////    public String sendEnrollEvent() {
////        String message = "User clicked Enroll Now";
////        ProducerRecord<String, String> record = new ProducerRecord<>(TOPIC, "enrollEvent", message);
////        kafkaProducer.send(record);
////        return "Enroll event sent";
////    }
////
////    @PostMapping("/pay")
////    public String sendPayEvent() {
////        String message = "User clicked Pay Now";
////        ProducerRecord<String, String> record = new ProducerRecord<>(TOPIC, "payEvent", message);
////        kafkaProducer.send(record);
////        return "Pay event sent";
////    }
//}
