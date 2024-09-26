package com.github.com.devleoviana.Library.Controller;

import com.github.com.devleoviana.Library.model.Book;
import com.github.com.devleoviana.Library.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Books")
public class BookController {
    @Autowired
    BookService service;
    @GetMapping
    public List<Book> getAllBooks(){
        return service.getBook();
    }
    @GetMapping("/{id}")
    public Book getBookById(@PathVariable long id){
        return service.getBookById(id);
    }
    @DeleteMapping("/{id}")
    public void deleteBookById(@PathVariable long id){
        service.deleteBookById(id);
    }
    @PostMapping
    public Book addBookById(@RequestBody Book data){
        return service.addBookById(data);
    }
}
