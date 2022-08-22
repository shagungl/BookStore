package com.globallogic.controller;
import java.util.List;


import javax.persistence.OneToMany;

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
import com.globallogic.repo.BookCatagoryRepo;



@RestController
@RequestMapping("admin")
public class AdminCon {
	
	@Autowired
	BookCatagoryRepo BCrepo;
	
	@Autowired
	BookRepo Bookrepo;
	
	
	
	@GetMapping("/")
	public List<Book >getCat() {
		return Bookrepo.findAll();
	}
	
	@PostMapping("/")
	public Book saveDept(@RequestBody Book catEntity){
		Book entity= (Book) BCrepo.findById();
		return catEntity;
		
	}

	@PutMapping("/")
    public Book updateDept(@RequestBody Book catEntity){
		Bookrepo.save(catEntity);
		return catEntity;
		
	}
	
	@DeleteMapping("/{id}")
    public String deleteDept(@PathVariable("id") int id){
	    Bookrepo.deleteById(id);
		return "Data deleted successfully";
	}


}
