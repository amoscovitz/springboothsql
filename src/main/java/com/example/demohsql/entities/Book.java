package com.example.demohsql.entities;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "book")
public class Book {
/*
 * CREATE TABLE books (id INT NOT NULL,title VARCHAR(50) NOT NULL,author VARCHAR(20) NOT NULL,submissiondate DATE,PRIMARY KEY (id) );
 * */
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	private String title;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public Date getSubmissionDate() {
		return submissionDate;
	}

	public void setSubmissionDate(Date submissionDate) {
		this.submissionDate = submissionDate;
	}

	private String author;
	
	@Column(name="submissiondate")
	private Date submissionDate;
	
	protected Book() {}	
	
	public Book(String title, String author, Date submissionDate)
	{
		this.title = title;
		this.author = author;
		this.submissionDate = submissionDate;
	}
		
	public String toString()
	{
		return this.title;
	}
	
	
}
