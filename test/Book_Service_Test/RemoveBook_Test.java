package Book_Service_Test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import BookStore_Service.BookStore;
import Book_Model.Book;

class RemoveBook_Test {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}
	
//remove	
@Test
	public void RemoveBooksTest() {
		BookStore Book = new BookStore();
		
		Book book1 = new Book("1", "Java Cording", "K.A. Brian","Learning","Sarasavi");
		Book book2 = new Book("2", "Learn SQL", "D.N.L. Joshep", "Learning","Gunasena");
		
		Book.addBook(book1);
		//Book.addBook(book2);
		Book.removeBook(book1);
		//Book.removeBook(book2);
		
		List<Book> listOfBooks = Book.books();
		
		assertTrue(listOfBooks.isEmpty(),"List of books is not empty!!!");
		
	}

//update
//@Test
//public void UpdateeBooksTest() {
//	BookStore Book = new BookStore();
//	
//	Book oldbook = new Book("1", "Java Cording", "K.A. Brian");
//	Book newbook = new Book("2", "Spring framework", "N.S. Dias");
//	
//	Book.addBook(oldbook);
//	//Book.addBook(book2);
//	
//	Book.updateBook(oldbook,newbook);
//	//Book.removeBook(newbook);
//	
//
//	 
//	  boolean OldBook = Book.updateBook(oldbook,newbook);
//	  Book_Model.Book expected = newbook;
//	  assertEquals(expected, OldBook,"Error!!");
////	 
//	//assertTrue(listOfBooks.isEmpty(),"List of books is not empty!!!!");
//	
//}
}
