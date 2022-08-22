package com.globallogic.controller;

import java.util.List;
import java.util.ArrayList;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.globallogic.repo.BookCatagoryRepo;
import com.globallogic.repo.BookRepo;
import com.globallogic.entity.Book;
import com.globallogic.entity.BookCatagory;



@RestController
@RequestMapping("/catagory")
public class BookCatagoryCon {
	
	
	@Autowired
	BookCatagory BCrepo;
	
	@Autowired
    BookRepo brepo;

	@GetMapping("/")
	public List<BookCatagory >getCat() {
	return BCrepo.findAll();
}

	@PostMapping("/")
    public BookCatagory saveCatagory(@RequestBody BookCatagory bookcatagory)
	{
		List<Book> books=new ArrayList<>();
	for(Book a:bookcatagory.getBook()) {
		Book book=BCrepo.findById(a.getId()).get();
		books.add(book);
		
		
	}
	bookcatagory.setBook(books);
	BCrepo.save(bookcatagory);
	return bookcatagory;
	}
		@PutMapping("/")
   public List<BookCatagory> updateCatagory(@RequestBody BookCatagory bookcatagory){
	return BCrepo.save(bookcatagory);
		}
		
}
//@RestController
//@RequestMapping("/category")
//public class BookCategoryCon{
//
//	@Autowired
//	BookCatagoryRepo BCRepo;
//
//	@GetMapping("/")
//	public List<BookCatagory> getCategory() {
//		return BCRepo.findAll();
//	}
//
//	@PostMapping("/")
//	public List<BookCatagory> saveCategory(@RequestBody BookCatagory bookcategory) {
//
//		return BCRepo.save(bookcatagory);
//	}
//
//	@PutMapping("/")
//	public List<BookCatagory> updateCategory(@RequestBody BookCatagory bookcategory) {
//
//		return BCRepo.save(bookcatagory);
//	}
//}

