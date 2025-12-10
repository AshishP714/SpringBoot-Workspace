package com.tka.SpringBootDay1;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyClass {

	@GetMapping("/Hotstar")
	public String homePage() {
		return "Wellcome to Hotstar\n\nWatch your plan\nSports\nSeries\nMoves";
	}

	@PostMapping("/sports")
	public String sports() {
		return "Watch sports\n\nCrickte\nKabaddi\nKhoko";
	}

	@PutMapping("/series")
	public String tvSerial() {
		return "Watch series\n\nGame of throne\nAsur";
	}

	@DeleteMapping("/movies")
	public String movies() {
		return "Watch moves\n\nSalar\nKGF\nDasara\nKantra";
	}

}