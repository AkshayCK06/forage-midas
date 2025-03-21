package com.jpmc.midascore.kafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaHandler;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;


@Component
@KafkaListener(topics = "${general.kafka-topic}", groupId = "midas-core-group")
public class KafkaConsumer {
    private static final Logger logger = LoggerFactory.getLogger(KafkaConsumer.class);

    @KafkaHandler
    public void listen(String transaction) {
        logger.info("Received transaction: {}", transaction);
    }
}
