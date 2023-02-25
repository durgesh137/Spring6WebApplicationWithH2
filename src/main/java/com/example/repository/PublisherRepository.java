package com.example.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.domain.Publisher;

public interface PublisherRepository extends CrudRepository<Publisher, Long>{
	//At run time spring data JPA will provide the implementation of the PublisherRepository
	//we need not write the implementation
}
