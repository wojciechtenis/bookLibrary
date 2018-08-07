package com.testing.book.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("service2")
public class BookService2Impl implements BookService {

    @Override
    public void addBook() {
        System.out.println("DODALEM KSIAZKE Z DRUGIEGO SERSU");
    }
}
