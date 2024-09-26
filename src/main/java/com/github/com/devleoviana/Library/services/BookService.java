package com.github.com.devleoviana.Library.services;
import com.github.com.devleoviana.Library.model.Book;
import com.github.com.devleoviana.Library.repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    @Autowired
    BookRepository repository;
    public List<Book> getBook(){
        return repository.findAll();
    }
    public Book getBookById(long id){
        return repository.getReferenceById(id);
    }
    public void deleteBookById(long id){
        repository.deleteById(id);
    }
    public Book addBookById(Book data){
        return repository.save(data);
    }
}

