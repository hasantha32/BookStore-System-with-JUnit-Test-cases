package Magazine_Service_Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import BookStore_Service.BookStore;
import Book_Model.Book;
import MagazineStore_Service.MagazineService;
import Magazine_Model.Magazine;
//import BookStore_Exception.BookNotFound;
import BookStore_Exception.BookNotFoundException;

class GetMagazineByAuthor_Test {

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
	

	
	//getbyAuthor
	@Test
	public void checkMagazineStore_isNullbyTitle() {
		MagazineService magazineService = new MagazineService();
		
		Magazine HTMLCording = new Magazine("1", "HTML Cording", "S.K.Boar","Learning","Gunasena","2012/02/01");
		Magazine MEARNStackLearning = new Magazine("2", "MEARN Stack Learning", "N.H. Samuel","Learning", "Sathira","2018/04/03");
		Magazine JAVACording = new Magazine("3", "Java Cording", "N.H. Samuel", "Learning", "Kadukara","2017/06/05");
		
		magazineService.addMagazine(HTMLCording);
		magazineService.addMagazine(MEARNStackLearning);
		magazineService.addMagazine(JAVACording);
		
		Magazine actualMagazine = magazineService.getMagazineByAuthor("N.H. Samuel");
	//	Book actualMagazine = magazineService.getBookByAuthor("N.S. Sathira");
		
		assertNull(actualMagazine, "Your selected athour's magazine/magazines available in magazinestore!! ,Magazine is not null!!!");
	}
	

}
