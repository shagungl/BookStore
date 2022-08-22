package com.globallogic.repo;

import java.util.List;
import com.globallogic.entity.BookCatagory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookCatagoryRepo extends JpaRepository<BookCatagory, Integer>{

	List<BookCatagory>findById();
	
}

