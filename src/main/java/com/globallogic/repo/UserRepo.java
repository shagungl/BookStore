package com.globallogic.repo;
import org.springframework.data.jpa.repository.JpaRepository;
import com.globallogic.entity.Book;

public interface UserRepo extends JpaRepository<Book, Integer>{

	

}
