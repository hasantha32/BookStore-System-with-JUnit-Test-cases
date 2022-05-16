package Book_Service_Test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import BookStore_Service.Reg_LibraryInventory_Manager;

class Reg_LibraryInventory_Manager_Test {

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
//reg successfully
	@Test
	void test1() {
	
		Reg_LibraryInventory_Manager t1= new Reg_LibraryInventory_Manager();
		
		String NAME="Hasantha";
		String GENDER="Male";
		int AGE = 24;
	    String EMAIL= "h@gmail.com";
		String PHONE = "0713594410";
		
		
		String actual= t1.Reg(NAME, GENDER, AGE, EMAIL, PHONE);
		String expect = "Employee Registered successfully !!!";		
		assertEquals(expect, actual);
	}
	
	
	
//name validation	
	@Test
	void test2() {
	
		Reg_LibraryInventory_Manager t2= new Reg_LibraryInventory_Manager();
		
		System.out.println("");
		System.out.println("Test2");
		System.out.println("");
		
		String NAME="Hasantha@12";
	//	String NAME="Hasantha";
		String GENDER="Male";
		int AGE = 24;
		String EMAIL= "h@gmail.com";
		String PHONE = "0713594410";
		
		if(!NAME.matches(("[a-zA-z]+([ '-][a-zA-Z]+)*"))){
			String actual= t2.Reg(NAME, GENDER, AGE, EMAIL, PHONE);
			String expect = "Employee Registration fail !!! , Please enter username with valid format !!!";		
			assertEquals(expect, actual);
		}else {
			String actual= t2.Reg(NAME, GENDER, AGE, EMAIL, PHONE);
			String expect = "Successfull !!";			
			assertEquals(expect, actual);
		}
		
	}
	
	

	
//age validation
	@Test
	void test3() {
	
		Reg_LibraryInventory_Manager t3= new Reg_LibraryInventory_Manager();
		
		System.out.println("");
		System.out.println("Test3");
		System.out.println("");
		
		String NAME="Hasantha";
		String GENDER="Male";
	    int AGE = 72;
		//int AGE = 24;
		String EMAIL= "h@gmail.com";
		String PHONE = "0713594410";
		
		if((AGE > 70)){
			String actual= t3.Reg(NAME, GENDER, AGE, EMAIL, PHONE);
			String expect = "Sorry, you cannot register to the system. Age should be less than 70";
			assertEquals(expect, actual);
		}else {
			String actual= t3.Reg(NAME, GENDER, AGE, EMAIL, PHONE);
			String expect = "Successfull !!";
			assertEquals(expect, actual);
		}
	}
	
	
//email validation
	@Test
	void test4() {
	
		Reg_LibraryInventory_Manager t4= new Reg_LibraryInventory_Manager();
		
		System.out.println("");
		System.out.println("Test4");
		System.out.println("");
		
		String NAME="Hasantha";
		String GENDER="Male";
		int AGE = 24;
		String EMAIL= "hgmail.com";
	//	String EMAIL= "h@gmail.com";
		String PHONE = "0713594410";
		
		if(!EMAIL.matches("^[A-Za-z0-9+_.-]+@(.+)$")){
			String actual= t4.Reg(NAME, GENDER, AGE, EMAIL, PHONE);
			String expect = "Employee Registration fail !!! , Please enter email with valid format !!!";			
			assertEquals(expect, actual);
		}else {
			String actual= t4.Reg(NAME, GENDER, AGE, EMAIL, PHONE);
			String expect = "Successfull !!";			
			assertEquals(expect, actual);
		}
	}
	
//phone number validation
	@Test
	void test5() {
	
		Reg_LibraryInventory_Manager t5= new Reg_LibraryInventory_Manager();
		
		System.out.println("");
		System.out.println("Test5");
		System.out.println("");
		
		String NAME="Hasantha";
		String GENDER="Male";
		int AGE = 24;
		String EMAIL= "h@gmail.com";
		String PHONE = "0713594410678";
		//String PHONE = "0713594410";
		
		if(!PHONE.matches("\\d{10}")){
			String actual= t5.Reg(NAME, GENDER, AGE, EMAIL, PHONE);
			String expect = "Employee Registration fail !!! , Please enter phone with valid format !!!";		
			assertEquals(expect, actual);
		}else {
			String actual= t5.Reg(NAME, GENDER, AGE, EMAIL, PHONE);
			String expect = "Successfull !!";
			assertEquals(expect, actual);
		}
	}


	

}
