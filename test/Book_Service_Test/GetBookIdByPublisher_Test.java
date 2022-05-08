package Book_Service_Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import BookStore_Service.BookStore;
import Book_Model.Book;

class GetBookIdByPublisher_Test {

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
	
	//getbookIdbyPublisher
	@Test
	public void getbookIdbyPublisherTest() {
		BookStore bookService = new BookStore();
		
		Book SpringFramewoerkGuidBook = new Book("1", "Spring Framewoerk Guid Book", "N.H. Lianal","Learning","Gunasena");
		Book StartAngularBook = new Book("2", "Start Angular Book", "S.K.Nick","Learning", "Sarasavi");
		Book HTMLCording = new Book("3", "HTML Cording", "R.S.P Kamal","Learning","Gunasena");
		Book MEARNStackLearning = new Book("4", "MEARNStack Learning", "S.K.Dias", "Learning","Gunasena");
		
		bookService.addBook(SpringFramewoerkGuidBook);
		bookService.addBook(StartAngularBook);
		bookService.addBook(HTMLCording);
		bookService.addBook(MEARNStackLearning);
		
		String[] actualBookIds = bookService.getBookIdsByPublisher("Gunasena");
		
		assertArrayEquals(new String[] {"1", "3", "4"}, actualBookIds, "bookIds didn't match !!!");
	}
	
	
	//getbyPublisher
	@Test
	public void checkBookStore_isNullbyTitle() {
		BookStore bookService = new BookStore();
		
		Book HTMLCording = new Book("3", "HTML Cording", "S.K.Boar","Learning","Gunasena");
		Book MEARNStackLearning = new Book("4", "MEARN Stack Learning", "N.H. Samuel","Learning","Sarasavi");
		
		bookService.addBook(HTMLCording);
		bookService.addBook(MEARNStackLearning);
		
		Book actualBook = bookService.getBookByPublisher("Kadurata publishers");
	//	Book actualBook = bookService.getBookByPublisher("Gunasena");
		
		assertNull(actualBook, "Book is not null ,that book is available in bookstore !!!");
	}

}
