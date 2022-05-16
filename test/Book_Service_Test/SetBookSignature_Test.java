package Book_Service_Test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import BookStore_Service.BookStore;


class SetBookSignature_Test {

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
	 public void testDisplayStudentName() {
		 
		 BookStore Book = new BookStore();
		 
//	  Student student = new Student();
//	  String firstName="Hasantha";
//	  String lastName="Madhushan";
		 String bookId="1";
		 String title="Learn Spring Framework";
		 String author="R.P.Wells";
		 String type="Novel";
		 String publisher="L.S.Joshep";
		 
	  
	  String BookSignature = Book.displayBookInOrder(bookId,title,author,type,publisher);
	  String expected= "1 --Learn Spring Framework --R.P.Wells --Novel --L.S.Joshep";
	  assertEquals(expected, BookSignature);
	 }
	 

}
