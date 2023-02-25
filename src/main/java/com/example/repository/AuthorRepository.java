package com.example.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.domain.Author;

public interface AuthorRepository extends CrudRepository<Author, Long>{
	//At run time spring data JPA will provide the implementation of the AuthorRepository
	//we need not write the implementation
}
