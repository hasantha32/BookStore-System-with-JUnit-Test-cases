package Book_Service_Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import BookStore_Service.BookStore;
import Book_Model.Book;

class GetBookTitlesByPublisher_Test {

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
	public void getbookTitlebyPublisherTest() {
		BookStore bookService = new BookStore();
		
		Book HTMLCoding = new Book("1", "HTML Coding", "N.S. Rins","Learning","Sarasavi");
		Book LearnMLeasy = new Book("2", "Learn ML easy", "R.M.N Gorge","Learning","Kadukara");
		Book JavascriptBasics = new Book("3", "Javascript Basics", "N.S. Rins","Learning", "Sarasavi");
		
		bookService.addBook(HTMLCoding);
		bookService.addBook(LearnMLeasy);
		bookService.addBook(JavascriptBasics);
		
		List<String> actualTitles = bookService.getBookTitlesByPublisher("Sarasavi");
		
		List<String> expectedTitles = new ArrayList<>();
		expectedTitles.add("HTMLCoding");
		expectedTitles.add("JavascriptBasics");
		
		//expectedTitles.add("LearnMLeasy");
		
		assertIterableEquals(expectedTitles, actualTitles, "Book titles didnt match !");
	}

}
