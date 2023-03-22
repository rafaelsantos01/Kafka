package com.portal.api.message;


import com.portal.api.Car.dto.CarPostDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class KafkaProducerMessage {

    @Autowired
    private KafkaTemplate<String, CarPostDTO> kafkaTemplate;

    private final String KAFKA_TOPIC = "topic_rafael_1";

    public void sendMessage(CarPostDTO carPostDTO){
        kafkaTemplate.send(KAFKA_TOPIC, carPostDTO);
    }

}
