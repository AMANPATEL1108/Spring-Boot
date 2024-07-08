package com.api.book.bootrestbook.services;

import com.api.book.bootrestbook.dao.BookRepository;
import com.api.book.bootrestbook.entities.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class BookService {

    @Autowired
    public BookRepository bookRepository;

//    private static List<Book> list= new ArrayList<>();
//
//    static {
//        list.add(new Book(12,"Java Completer","XYZ"));
//        list.add(new Book(45,"python Completer","pwq"));
//        list.add(new Book(13,"c++ Completer","asd"));
//    }

    public List<Book> getAllBooks() {
        List<Book> list = (List<Book>) this.bookRepository.findAll();
        return list;
    }

    public Book getBookById(int id) {
        Book book = null;
        try {
            Optional<Book> optionalBook = Optional.ofNullable(this.bookRepository.findById(id));
            if(optionalBook.isPresent()) {
                book = optionalBook.get();
            }
        } catch(Exception e) {
            e.printStackTrace();
        }
        return book;
    }

//    public List<Book> getAllBooks() {
//        return list;
//    }
//
//    public Book getBookById(int id){
//        Book book=null;
//        list.stream().filter(e ->
//            e.getId() == id
//        ).findFirst().get();
//
//        return book;
//    }

    //adding book
    public Book addBook(Book b) {
        Book result = bookRepository.save(b);
        return result;
    }

    //delete book
    public void deleteBook(int bid) {
//        list = list.stream().filter(book -> book.getId() != bid).collect(Collectors.toList());
//        if (book.getId() != bid){
//            return true;
//        } else {
//            return false;
//        }
        bookRepository.deleteById(bid);
    }

    //update book
    public void updateBook(Book book, int bookId) {
//        list = list.stream().map(b -> {
//            if(b.getId() == bookId){
//                b.setTitle(book.getTitle());
//                b.setAuthor(book.getAuthor());
//            }
//            return b;
//        }).collect(Collectors.toList());
        book.setId(bookId);
        bookRepository.save(book);
    }
}
