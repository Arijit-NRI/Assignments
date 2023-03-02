package com.springbootrest.service;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.springbootrest.dao.BookRepository;
import com.springbootrest.model.Book;

@Service
public class BookService {

//	@Autowired
	private BookRepository bookRepository;



	// fetch all books
	public List<Book> getAllBooks() {
		return (List<Book>) this.bookRepository.findAll();
	}

	// fetch book by id
	public Book getBookById(int id) {
		Book book = null;
		try {
			book = this.bookRepository.findById(id);
		} catch (Exception e2) {

		}
		return book;
	}

	// post
	public Book addBook(Book book) {
//		list.add(book);
		Book res = this.bookRepository.save(book);
		return book;
	}

	// delete
	public void deleteBook(int id) {
//		list.removeIf(b -> b.getId() == id);
		this.bookRepository.deleteById(id);
	}

	// update
	public Book updateBook(int id, Book bookDetails) {
//		Book book = list.stream().filter(b -> b.getId() == id).findFirst().get();
//		book.setTitle(bookDetails.getTitle());
//		book.setAuthor(bookDetails.getAuthor());
//		return book;
		bookDetails.setId(id);
		this.bookRepository.save(bookDetails);
		return bookDetails;
	}
}
