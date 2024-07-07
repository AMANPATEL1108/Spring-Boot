package com.api.book.bootrestbook.controller;


import com.api.book.bootrestbook.entities.Book;
import com.api.book.bootrestbook.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookController {

@Autowired
    private BookService bookService;

    @GetMapping("/books")
   @ResponseBody
    public List<Book> getBooks(){
        return this.bookService.getAllBooks();
//        Book book=new Book();
//        book.setId(12324);
//        book.setTitle("Java Complete ref");
//        book.setAuthor("XYZ");
//        return book;


    }
@GetMapping("/books/{id}")
    public  Book getBook(@PathVariable("id") int id){
return  bookService.getBookById(id);
    }



}
