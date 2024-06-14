package com.rohit.spring_kafka_demo.controller;

import com.rohit.spring_kafka_demo.service.KafkaSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/kafka")
public class KafkaController {

    @Autowired
    KafkaSender kafkaSender;

    @GetMapping("/producer")
    public String producer(@RequestParam("message") String message){
        kafkaSender.send(message);
        return "message sent succesfully";
    }


}
