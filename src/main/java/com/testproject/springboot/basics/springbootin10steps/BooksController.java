package com.testproject.springboot.basics.springbootin10steps;

import java.util.Arrays;
import java.util.List;

//import org.assertj.core.util.Arrays;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BooksController {

	@GetMapping("/books")
	public List<Book> getAllBooks(){
		return Arrays.asList(new Book(1,"Jipsons basics","jipson"));
	}
	
}
