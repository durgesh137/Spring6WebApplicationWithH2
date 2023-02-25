package com.example.repository;


import org.springframework.data.repository.CrudRepository;

import com.example.domain.Book;

public interface BookRepository extends CrudRepository<Book, Long>{
	//At run time spring data JPA will provide the implementation of the BookRepository
	//we need not write the implementation
}
