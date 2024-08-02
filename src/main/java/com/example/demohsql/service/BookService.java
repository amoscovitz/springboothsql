package com.example.demohsql.service;

import java.sql.Date;
import org.springframework.stereotype.Service;
import com.example.demohsql.entities.Book;
import com.example.demohsql.repository.BookRepository;

import jakarta.annotation.Resource;

@Service
public class BookService {

	@Resource
	private BookRepository bookRepository;

	public String findAllBooks()
	{
		StringBuilder listbooks = new StringBuilder();
		Date d = new Date(123); 
		bookRepository.save(new Book("mytitle", "john",d));

		bookRepository.findAll().forEach(book -> {listbooks.append(" ");listbooks.append(book.toString());});

		return listbooks.toString();
	}
}
