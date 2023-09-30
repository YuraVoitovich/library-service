package io.voitovich.testmodsentask.libraryservice.events.service;

import org.springframework.kafka.annotation.KafkaListener;

public interface KafkaConsumerService {

    @KafkaListener(topics = "librarytopic")
    void listen(String message);
}
