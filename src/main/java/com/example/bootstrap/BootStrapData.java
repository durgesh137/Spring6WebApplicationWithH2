package com.example.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.domain.Author;
import com.example.domain.Book;
import com.example.domain.Publisher;
import com.example.repository.AuthorRepository;
import com.example.repository.BookRepository;
import com.example.repository.PublisherRepository;

@Component //to tell Spring detect it as Spring managed component
public class BootStrapData implements CommandLineRunner{
	
	private final AuthorRepository authorRepository;
	private final BookRepository bookRepository;
	private final PublisherRepository publisherRepository;
	
	//automatic constructor injection will be done here
	public BootStrapData(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
		super();
		this.authorRepository = authorRepository;
		this.bookRepository = bookRepository;
		this.publisherRepository = publisherRepository;
	}


	@Override
	public void run(String... args) throws Exception {
		System.out.println("Started in Bootstrap");
		//instantiating Publisher
		Publisher publisher = new Publisher();
		publisher.setName("SFG publishing");
		publisher.setCity("St Petersburg");
		publisher.setState("Florida");
		
		publisherRepository.save(publisher);//save publisher
		
		Author eric = new Author("Eric", "Evans");
		Book book = new Book("Domain Driven Design", "123123");
		eric.getBooks().add(book);
		book.getAuthors().add(eric);
		
		book.setPublisher(publisher);
		publisher.getBooks().add(book);
		
		authorRepository.save(eric);
		bookRepository.save(book);
		publisherRepository.save(publisher);
		
		Author rod = new Author("Rod", "Johnson");
		Book noEJB = new Book("J2EE Development without EJB", "39234234");
		rod.getBooks().add(noEJB);
		noEJB.getAuthors().add(rod);
		
		noEJB.setPublisher(publisher);
		publisher.getBooks().add(noEJB);
		
		authorRepository.save(rod);
		bookRepository.save(noEJB);
		publisherRepository.save(publisher);
		
		System.out.println("Number of Books: "+bookRepository.count());
		System.out.println("Number of Publishers: "+publisherRepository.count());
		System.out.println("Publisher number of books is "+publisher.getBooks().size());
	}

}
