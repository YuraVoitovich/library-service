package io.voitovich.testmodsentask.libraryservice.service.impl;

import io.voitovich.testmodsentask.libraryservice.entity.Book;
import io.voitovich.testmodsentask.libraryservice.repository.BookRepository;
import io.voitovich.testmodsentask.libraryservice.service.BookService;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.UUID;

@Service
public class BookServiceImpl implements BookService {

    private final BookRepository repository;

    public BookServiceImpl(BookRepository repository) {
        this.repository = repository;
    }

    @Override
    public void takeBook(String uuid) {
        repository.save(Book.builder().id(UUID.fromString(uuid))
                .startDate(LocalDate.now())
                .endDate(LocalDate.now()
                        .plusMonths(1))
                .build());
    }
}
