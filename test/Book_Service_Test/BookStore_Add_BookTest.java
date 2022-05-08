package Book_Service_Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import BookStore_Service.BookStore;
import static org.junit.jupiter.api.Assertions.assertTrue;
import java.util.List;
//import org.junit.jupiter.api.Test;
import Book_Model.Book;



class BookStore_Add_BookTest {

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

	@Test
	public void addBook_test_1() {
		BookStore add_Book = new BookStore();
		
		Book book1 = new Book("1", "Java Cording", "K.A Brian", "Learning", "R.S.Samuel");
		
	//	add_Book.addBook(book1);
	
		
		List<Book> listOfBookss = add_Book.books();
		
		assertTrue(listOfBookss.isEmpty(),"List of books is not empty!!!");
		
	}
	
	@Test
	public void addBook_test_2() {
		BookStore add_Book = new BookStore();
		
		Book book1 = new Book("1", "Java Cording", "K.A Brian", "Novel", "R.S.Samuel");
		
		//add_Book.addBook(book1);
	
		
		List<Book> listOfBookss = add_Book.books();
		
		assertFalse(listOfBookss.isEmpty(),"List of books is empty!!!");
		
	}
	
	
	
}
