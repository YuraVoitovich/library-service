package io.voitovich.testmodsentask.libraryservice.events.service.impl;

import io.voitovich.testmodsentask.libraryservice.events.service.KafkaConsumerService;
import io.voitovich.testmodsentask.libraryservice.service.BookService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class KafkaConsumerServiceImpl implements KafkaConsumerService {

    private final BookService bookService;

    public KafkaConsumerServiceImpl(BookService bookService) {
        this.bookService = bookService;
    }

    @Override
    public void listen(String uuid) {
        log.info("Received Kafka message with UUID: {}", uuid);
        bookService.takeBook(uuid);
    }
}
