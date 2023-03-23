package com.store.car.message;

import com.store.car.Car.dto.CarPostDTO;
import com.store.car.Car.service.CarPostService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaConsumerMessage {

    private final Logger LOG = LoggerFactory.getLogger(KafkaConsumerMessage.class);
    @Autowired
    private CarPostService carPostService;

    @KafkaListener(topics = "topic_rafael_1", groupId = "test-consumer-group")
    public void listening(CarPostDTO carPost) {

        LOG.info("CAR STORE - Received Car Post information: {}", carPost);
        carPostService.newPostDetails(carPost);

    }

}
