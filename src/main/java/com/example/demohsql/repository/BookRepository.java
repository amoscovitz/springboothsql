package com.example.demohsql.repository;

import org.springframework.stereotype.Repository;

import com.example.demohsql.entities.Book;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface BookRepository extends JpaRepository<Book, Long>{
	
}
