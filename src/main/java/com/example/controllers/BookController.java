package com.example.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.repository.BookRepository;

@Controller
public class BookController {
	
	private final BookRepository bookRepository;
	
	//autowiring with constructor injection will be done automatically 
	//here spring 6 is used
	public BookController(BookRepository bookRepository) {
		super();
		this.bookRepository = bookRepository;
	}


	@RequestMapping("/books")
	public String getBooks(Model model) {
		model.addAttribute("books", bookRepository.findAll());
		return "books/list"; //list.html within books folder
	}
}
