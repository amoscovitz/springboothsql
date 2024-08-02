package com.example.demohsql;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demohsql.entities.Book;
import com.example.demohsql.service.BookService;

@SpringBootApplication
@RestController
public class DemohsqlApplication {
	
	@Autowired
	private BookService bookService;
	
	public static void main(String[] args) {
		SpringApplication.run(DemohsqlApplication.class, args);
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
