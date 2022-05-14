package Book_Service_Test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import BookStore_Service.LibraryInventoryManager_Datausage;

class LibraryInventoryManager_Datausage_test {

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
	void testEmployeeInternetBillChargers() {
		LibraryInventoryManager_Datausage test= new LibraryInventoryManager_Datausage();
		
		int actual= test.LibraryInventoryManagerInternetBillChargers();
		int expect = 1250;
		
		assertEquals(expect, actual);
	}

}
