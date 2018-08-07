package com.testing.book.controller;

import com.testing.book.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/book")
public class BookController {

    @Autowired
    @Qualifier("service2")
    private BookService bookService;



    // GET POST DELETE
    //
    // www.mojaksiegarnia.pl/api/book/getinfo

    @RequestMapping(value = "/getinfo", method = RequestMethod.GET)
    public void getInfo(){
        System.out.println("SEiam jestem w metodzie getInfo");
        bookService.addBook();
    }

    @RequestMapping(value = "/getinfo/{id}/{title}", method = RequestMethod.GET)
    public void getInfoById(@PathVariable("id") Long id, @PathVariable("title") String title){
        System.out.println(id + " " + title);
    }

}
