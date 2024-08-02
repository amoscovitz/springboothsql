package com.example.demohsql.service;

import org.springframework.stereotype.Service;
import com.example.demohsql.repository.BookRepository;

import jakarta.annotation.Resource;

@Service
public class BookService {

	@Resource
	private BookRepository bookRepository;

	public String findAllBooks()
	{
		StringBuilder listbooks = new StringBuilder();

		bookRepository.findAll().forEach(book -> {listbooks.append(" ");listbooks.append(book.toString());});

		return listbooks.toString();
	}
}
