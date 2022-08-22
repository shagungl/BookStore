package com.globallogic.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


	@Entity
	@Table(name="bookcatagory")
	public class BookCatagory {

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private int id;
		@Override
		public String toString() {
			return "BookCategory [id=" + id + ", categoryname=" + categoryname + "]";
		}


		public int getId() {
			return id;
		}


		public void setId(int id) {
			this.id = id;
		}


		public String getCategoryname() {
			return categoryname;
		}


		public void setCategoryname(String categoryname) {
			this.categoryname = categoryname;
		}


		private String categoryname;
		
		
		public BookCatagory() {
		}


		public List<BookCatagory> findAll() {
			// TODO Auto-generated method stub
			return null;
		}


		public Book[] getBook() {
			// TODO Auto-generated method stub
			return null;
		}


		public Object findById(int id2) {
			// TODO Auto-generated method stub
			return null;
		}


		public void setBook(List<Book> books) {
			// TODO Auto-generated method stub
			
		}


		public List<BookCatagory> save(BookCatagory bookcatagory) {
			// TODO Auto-generated method stub
			return null;
		}
}
