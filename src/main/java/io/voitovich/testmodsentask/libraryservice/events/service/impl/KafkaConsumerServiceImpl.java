package io.voitovich.testmodsentask.libraryservice.events.service.impl;

import io.voitovich.testmodsentask.libraryservice.events.service.KafkaConsumerService;
import io.voitovich.testmodsentask.libraryservice.service.BookService;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumerServiceImpl implements KafkaConsumerService {

    private final BookService bookService;

    public KafkaConsumerServiceImpl(BookService bookService) {
        this.bookService = bookService;
    }

    @Override
    public void listen(String uuid) {
        bookService.takeBook(uuid);
    }
}
