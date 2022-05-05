package Book_Service_Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;





import static org.junit.jupiter.api.Assertions.assertEquals;


//import org.junit.jupiter.api.Test;

import Book_Model.Book;

import BookStore_Service.BookStore;




class BookStore_GetBookByID_Test {

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
	public void checkBookId_and_Booktitle_is_match() {
		BookStore bookService = new BookStore();
		
		Book SpringFramewoerkGuidBook = new Book("1", "Spring Framewoerk Guid Book", "Nick", "Learning", "Gunasena");
		Book StartAngularBook = new Book("2", "Start Angular Book", "Lianal","Learning","Sarasa");
		
		bookService.addBook(SpringFramewoerkGuidBook);
		bookService.addBook(StartAngularBook);
		
		Book actualBook = bookService.getBookById("1");
		//Book actualBook = bookService.getBookById("2");
		
		assertEquals("1", actualBook.getBookId());
		//assertEquals("Start Angular Book", actualBook.getTitle(), "Book title didn't match!!!!");
		assertEquals("Spring Framewoerk Guid Book", actualBook.getTitle(), "Book title didn't match!!!");
	}
	
	
	@Test
	public void checkBookStore_isNullbyID() {
		BookStore bookService = new BookStore();
		
		Book HTMLCording = new Book("3", "HTML Cording", "S.K.Boar","Learning", "Gunasena");
		Book MEARNStackLearning = new Book("4", "MEARN Stack Learning", "N.H. Samuel","Learning","Lorance Publishers");
		
		bookService.addBook(HTMLCording);
		bookService.addBook(MEARNStackLearning);
		
		Book actualBook = bookService.getBookById("5");
		assertNull(actualBook, "Book is not null !!!");
	}

}
