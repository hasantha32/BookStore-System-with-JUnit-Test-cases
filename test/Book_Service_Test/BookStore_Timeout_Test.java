package Book_Service_Test;

import static org.junit.jupiter.api.Assertions.*;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import BookStore_Service.BookStore;
import Book_Model.Book;

class BookStore_Timeout_Test {

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

//getBookTitlesByPublisher
	@Test
	public void assertTimeoutWithMessage() {
		BookStore bookService = new BookStore();
		

		for(int i = 1; i <= 1000; i++) {
			bookService.addBook(new Book(String.valueOf(i), "Learn Java", "R.P. Edison","Learning","Gunasena"));
		}
//		for(int i = 1; i <= 1000000; i++) {
//	     	bookService.addBook(new Book(String.valueOf(i), "Learn Java", "R.P. Edison","Learning","Gunasena"));
//		}
		
		List<String> actualTitles = new ArrayList<>();
		
		assertTimeout(Duration.ofMillis(1), () -> {
			actualTitles.addAll(bookService.getBookTitlesByPublisher("Gunasena"));
		}, "Performance issues with getBookTitlesByPublisher() method !!!");
		
		
		assertEquals(1000, actualTitles.size());
		//assertEquals(1000000, actualTitles.size());
	}	

}
