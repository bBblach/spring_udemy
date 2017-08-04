package org.udemy.spring5webapp;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
@Entity
public class Book {
	private String title;
	private String publisher;
	private String isbn;
	@ManyToMany
	@JoinTable(name="author_book", joinColumns=	@JoinColumn(name = "book_id" )
	, inverseJoinColumns=@JoinColumn(name = "author_id"))
	private Set <Author> authors = new HashSet<>();
	public Book() {
		super();
	}
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id; 
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Book(String title, String publisher, String isbn) {
		super();
		this.title = title;
		this.publisher = publisher;
		this.isbn = isbn;
	}
	public Book(String title, String publisher, String isbn, Set<Author> authors) {
		super();
		this.title = title;
		this.publisher = publisher;
		this.isbn = isbn;
		this.authors = authors;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public Set<Author> getAuthors() {
		return authors;
	}
	public void setAuthors(Set<Author> authors) {
		this.authors = authors;
	}

	
}
