package com.kafka.demo.rest;

import com.kafka.demo.producer.KafkaProducer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/kafka")
public class SampleController {

    private KafkaProducer kafkaProducer;

    public SampleController(KafkaProducer kafkaProducer) {
        this.kafkaProducer = kafkaProducer;
    }

    @GetMapping("/push")
    public String pushMessageInTopic(@RequestParam("message") String message) {
//        kafkaProducer.sendMessage(message);
        return "Message pushed in topic";
    }

}
