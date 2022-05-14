package Book_Service_Test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import BookStore_Service.ReturnBbooksDate_counterBynumofBooks;

class ReturnBbooksDate_counterBynumOfBooks_Test {

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
	void testReturnBbooksDate_counterBynumofBooks() {
		ReturnBbooksDate_counterBynumofBooks test8= new ReturnBbooksDate_counterBynumofBooks();
		
		int actual= test8.ReturnBooksDayCounter();
		int expect = 7;
		
		assertEquals(expect, actual);
	}

}
