package com.globallogic.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.globallogic.entity.Book;
import com.globallogic.repo.BookRepo;

@RestController
	@RequestMapping("/book")
	public class BookCon {
		
		@Autowired
		BookRepo bookrepo;
		
		
		
	
		@GetMapping
		public List<Book> getAllBooks(){
			return bookrepo.findAll();
		}
		
		@GetMapping("/{id}")
		public Book getBookById(@PathVariable int id) throws Exception {
			Optional<Book> res =bookrepo.findById(id);
			if(res.isEmpty())
				throw new Exception("Book not found");
			return res.get();
		}
		
		
		@GetMapping("/name/{name}")
		public Book getBookByName(@PathVariable String name) throws Exception {
			Book res = bookrepo.findBookByName(name);
			if(res==null)
				throw new Exception("Book not found");
			return res;
		}
		
		
		//POST request to add a  book
		@PostMapping
		public Book addBook(@RequestBody Book book) {
			return bookrepo.save(book);
		}
		
		//DELETE requests
		
		//DELETE request to delete a Student by id
		@DeleteMapping("/{id}")
		public String deleteBookById(@PathVariable int id) throws Exception {
			if(getBookById(id)!=null);
			bookrepo.deleteById(id);
			return "Delete ID="+id+": DELETED";
		}
		
		
		//If any field is missing, it will take default value for the respective field
		@PutMapping
		public Book updateBook(@RequestBody Book book) {
			return bookrepo.save(book);
		}
		
}
