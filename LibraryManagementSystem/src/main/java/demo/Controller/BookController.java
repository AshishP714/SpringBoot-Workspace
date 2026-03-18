package demo.Controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import demo.Entity.Books;
import demo.Repository.BookRepo;

@Controller
public class BookController {
	
	@Autowired
	BookRepo br;
	
	
	@GetMapping("/book-form")
	public String getBookForm() {
		
		return "book-form";
	}
	
	@GetMapping("/search")
	public String searchBook(@RequestParam Integer id, Model model) {
		
		
		Optional<Books> op = br.findById(id);
		
		if(op.isPresent()) {
		Books book=	op.get();
		model.addAttribute("book" ,book);
		}
		
		else {
			model.addAttribute("msg" , "book not found");
			
			
		}
		
		return "book-form";
	}

}
