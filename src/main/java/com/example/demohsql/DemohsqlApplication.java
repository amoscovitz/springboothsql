package com.example.demohsql;


import java.sql.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demohsql.entities.Book;
import com.example.demohsql.repository.BookRepository;
import com.example.demohsql.service.BookService;

import jakarta.annotation.PostConstruct;

@SpringBootApplication
@RestController
public class DemohsqlApplication {

	@Autowired
	private BookService bookService;

	@Autowired
	private BookRepository bookRepository;

	public static void main(String[] args) {
		SpringApplication.run(DemohsqlApplication.class, args);
	}
	
	@PostConstruct
    public void postConstruct() {
		Date d = new Date(123); 
		bookRepository.save(new Book("mytitle", "john",d));
		System.out.println("Book added");
	}

	@GetMapping("/get")
	public String get(@RequestParam(value = "name", defaultValue = "World") String name) {		
		return String.format("Get %s!",bookService.findAllBooks());
	}

	@PostMapping("/create")
	public String post(@RequestBody Book book) {
		return String.format("Created fake %s.",(book != null)? book.toString():"No book");
	}

}
