package Book_Service_Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import BookStore_Service.BookStore;
import Book_Model.Book;
//import BookStore_Exception.BookNotFound;
import BookStore_Exception.BookNotFoundException;

class GetBookByAuthor_Test {

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
	

	
	//getbyAuthor
	@Test
	public void checkBookStore_isNullbyTitle() {
		BookStore bookService = new BookStore();
		
		Book HTMLCording = new Book("1", "HTML Cording", "S.K.Boar","Learning","Gunasena");
		Book MEARNStackLearning = new Book("2", "MEARN Stack Learning", "N.H. Samuel","Learning", "Sathira");
		Book JAVACording = new Book("3", "Java Cording", "N.H. Samuel", "Learning", "Kadukara");
		
		bookService.addBook(HTMLCording);
		bookService.addBook(MEARNStackLearning);
		bookService.addBook(JAVACording);
		
		Book actualBook = bookService.getBookByAuthor("N.H. Samuel");
	//	Book actualBook = bookService.getBookByAuthor("Sathira");
		
		assertNull(actualBook, "Your selected athour's book/books available in bookstore!! ,Book is not null!!!");
	}
	

}
