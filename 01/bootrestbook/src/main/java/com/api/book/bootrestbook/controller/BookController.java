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

    //get all book handler
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
    //get single book handler
@GetMapping("/books/{id}")
    public  Book getBook(@PathVariable("id") int id){
return  bookService.getBookById(id);
    }

    // new book handler
    @PostMapping("/books")
     public Book addBook(@RequestBody Book book){
         Book b=this.bookService.addBook(book);
        System.out.println(book);
             return  b;

     }

     //delete book handler
    @DeleteMapping("/books/{bookId}")
    public void deletebook(@PathVariable("bookId")int bookId){
    this.bookService.deleteBook(bookId);
    }





}
