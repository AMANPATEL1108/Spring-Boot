package com.api.book.bootrestbook.services;

import com.api.book.bootrestbook.entities.Book;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;


@Component
public class BookService {
    private static List<Book> list= new ArrayList<>();

    static {
        list.add(new Book(12,"Java Completer","XYZ"));
        list.add(new Book(45,"python Completer","pwq"));
        list.add(new Book(12,"c++ Completer","asd"));


    }

    public  List<Book> getAllBooks() {
        return list;
    }
    public Book getBookById(int id){
        Book book=null;
        list.stream().filter(e->
            e.getId() == id
        ).findFirst().get();

        return book;
    }
}
