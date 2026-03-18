package demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import demo.Entity.Books;
import demo.Repository.BookRepo;

@SpringBootApplication
public class SpringBootMvc2Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMvc2Application.class, args);
		System.err.println("started");
	}

	@Autowired
	BookRepo br;
	
	@Override
	public void run(String... args) throws Exception {
		
		Books b1 = new Books();
		b1.setName("angular");
		b1.setPrice(469.0);
		b1.setQty(17);
		
		br.save(b1);
	}
}