package com.api.book.bootrestbook.controller;


import com.api.book.bootrestbook.entities.Book;
import com.api.book.bootrestbook.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class BookController {

@Autowired
    private BookService bookService;

    //get all book handler
    @GetMapping("/books")
   @ResponseBody
    public ResponseEntity<List<Book>> getBooks(){
        List<Book> list=bookService.getAllBooks();
        if (list.size()<=0){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }else {
    return  ResponseEntity.status(HttpStatus.CREATED).body(list);
        }
//        return this.bookService.getAllBooks();
//        Book book=new Book();
//        book.setId(12324);
//        book.setTitle("Java Complete ref");
//        book.setAuthor("XYZ");
//        return book;


    }
    //get single book handler
@GetMapping("/books/{id}")
    public  ResponseEntity<Book> getBook(@PathVariable("id") int id){
        Book book=bookService.getBookById(id);
        if (book==null){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        return  ResponseEntity.of(Optional.of(book));
    }

    // new book handler
    @PostMapping("/books")
     public ResponseEntity<Book> addBook(@RequestBody Book book){
        Book b=null;

        try{
            b=this.bookService.addBook(book);
            System.out.println(book);
            return ResponseEntity.of(Optional.of(b));
        }catch (Exception e) {
            e.printStackTrace();
            return  ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();

        }


     }

//     //delete book handler
    @DeleteMapping("/books/{bookId}")
    public void deletebook(@PathVariable("bookId")int bookId){
    this.bookService.deleteBook(bookId);
    }

    //update data
    @PutMapping("/books/{bookId}")
    public Book updateBook(@RequestBody Book book, @PathVariable("bookId") int bookId){
        this.bookService.updateBook(book, bookId);
        return book;
    }





}
