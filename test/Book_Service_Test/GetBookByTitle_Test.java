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

class GetBookByTitle_Test {

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
	
//getbookbyTitleException
	@Test
	public void exeptions_Test() {
//		BookStore bookService = new BookStore();
//		
//		Book HTMLCoding = new Book("1", "HTML Coding", "N.S. Rins");
//		Book LearnMLeasy = new Book("2", "Learn ML easy", "R.M.N Gorge");
//		
//		bookService.addBook(HTMLCoding);
//		bookService.addBook(LearnMLeasy);
		
//		assertThrows(NullPointerException.class,() -> bookService.getBookByTitle("Learn Flutter"),
//				"Different exception thrown!!!!");
//		
//		assertThrows(BookNotFoundException.class,() -> bookService.getBookByTitle("Learn Flutter"),
//				"Different exception thrown!!!!");
//		
	}
	
	
	//getbyTitle
	@Test
	public void checkBookStore_isNullbyTitle() {
		BookStore bookService = new BookStore();
		
		Book HTMLCording = new Book("3", "HTML Cording", "S.K.Boar","Learning","Gunasena");
		Book MEARNStackLearning = new Book("4", "MEARN Stack Learning", "N.H. Samuel","Learning", "Sathira");
		
		bookService.addBook(HTMLCording);
		bookService.addBook(MEARNStackLearning);
		
		Book actualBook = bookService.getBookByTitle("HTML Cording");
	//	Book actualBook = bookService.getBookByTitle("Sathira");
		
		assertNull(actualBook, "Book is exist!!!");
	}
	

}
