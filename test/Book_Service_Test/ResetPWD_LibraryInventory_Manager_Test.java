package Book_Service_Test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import BookStore_Service.Log_LibraryInventory_Manager;
import BookStore_Service.ResetPWD_LibraryInventory_Manager;

class ResetPWD_LibraryInventory_Manager_Test {

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

//Sussessfull
	@Test
	void test1() {
		ResetPWD_LibraryInventory_Manager t1= new ResetPWD_LibraryInventory_Manager();
		System.out.println("");
		System.out.println("Test1");
		System.out.println("");
		
		String actual= t1.ResetPWD();
		String expect = "Password updated Successful !!";
		
		assertEquals(expect, actual);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
//PASSWORD MISMATCH
	@Test
	void test2() {
		ResetPWD_LibraryInventory_Manager t2= new ResetPWD_LibraryInventory_Manager();
		
		System.out.println("");
		System.out.println("Test2");
		System.out.println("");
		
		String actual= t2.ResetPWD();
		String expect = "New password and reentered new password is not matching!";
		
		assertEquals(expect, actual);
	}

	
	
	
	
	
	
	
	
	
	
	
	
//USERNAME INCORRECT

		@Test
		void test3() {
			ResetPWD_LibraryInventory_Manager t3= new ResetPWD_LibraryInventory_Manager();
			
			System.out.println("");
			System.out.println("Test3");
			System.out.println("");
			
			String actual= t3.ResetPWD();
			String expect = "Password updated Fail !!!";
			
			assertEquals(expect, actual);
		}
		
		
		
		
		
		
		
		
		
		
		
		
//PASSWORD INCORRECT
	@Test
		void test4() {
			ResetPWD_LibraryInventory_Manager t4= new ResetPWD_LibraryInventory_Manager();
				
			System.out.println("");
			System.out.println("Test4");
			System.out.println("");
				
			String actual= t4.ResetPWD();
			String expect = "Password updated Fail !!!";
				
			assertEquals(expect, actual);
		}
		
		
}
