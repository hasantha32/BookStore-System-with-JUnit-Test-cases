package Book_Service_Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.util.LinkedList;
import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import BookStore_Service.BookStore;
import BookStore_Service.Count_PageNumbers_of_the_book;
import Book_Model.Book;
//import BookStore_Exception.BookNotFound;
import BookStore_Exception.BookNotFoundException;

class Count_PageNumbers_test {

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
	
	
	@Test
	public void addBook_test_2() {
		Count_PageNumbers_test add_Book = new Count_PageNumbers_test();
		
		Book book1 = new Book("1", "Java Cording", "K.A Brian", "Novel", "R.S.Samuel");
		
		//add_Book.addBook(book1);
	
		 List<Book> books = new LinkedList<>();
		//List<Book> listOfBookss = add_Book.books();
		
		assertEquals(books.size() == 0,"List of books is empty!!!");
		
	}
//	  @Test
//	    void testGetCurrentSize() {
//		  Count_PageNumbers_of_the_book count = new Count_PageNumbers_of_the_book();
//
//			int actual= Count_PageNumbers_of_the_book.calcTotalPages(null);
//			int expect = 1958;
//			int[] actualBookIds = bookService.getBookIdsByPublisher("Gunasena");
//			assertArrayEquals(new int[] {1,2}, actual,"w");
//
//			assertEquals(expect, actual);
//		}

}
