package Book_Service_Test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import BookStore_Service.Check_condition_OfTheBook;

class Check_condition_OfTheBook_Test {

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
	void testbooks() {
	Check_condition_OfTheBook test8= new Check_condition_OfTheBook();

	int Yearc = 2022;

	int yd = test8.Bookstore_checkbooks();
	int actual = test8.Bookstore_checkbooks();

	int expect = 22;

	assertEquals(expect, actual);
	}

}
