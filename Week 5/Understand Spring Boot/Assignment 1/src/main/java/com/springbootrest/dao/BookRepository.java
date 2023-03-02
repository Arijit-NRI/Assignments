package com.springbootrest.dao;

import org.springframework.data.repository.CrudRepository;

import com.springbootrest.model.Book;

public interface BookRepository extends CrudRepository<Book, Integer> {
	public Book findById(int id);
}
