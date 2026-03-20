package demo.Controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import demo.Entity.Books;
import demo.service.BookService;

@RestController
@RequestMapping("Books")
public class BookController {
	
	public BookService service;
	
	@PostMapping("add")
	public String insertBooks(@RequestBody Books books) {
		service.insertBook(books);
		return "Books added";
	}
}