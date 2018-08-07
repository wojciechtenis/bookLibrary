package com.testing.book.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("service1")
public class BookServiceImpl implements BookService {

    @Override
    public void addBook() {
        System.out.println("DODALEM KSIAZKE");
    }
}
