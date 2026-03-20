package demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import demo.Entity.Books;
import demo.Repository.BookRepository;

@Service
public class BookService {

	@Autowired
	public BookRepository repo;
	
	public String insertBook(Books books) {
		if (books != null) {
			repo.save(books);
			return "Book added";
		} else {
			return "books not saved";
		}
	}
	
}