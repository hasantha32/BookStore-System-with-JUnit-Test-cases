package BookStore_Service;
import java.util.Scanner;

public class Check_condition_OfTheBook {

	Scanner scan = new java.util.Scanner(System.in);

	public int Bookstore_checkbooks() {




	System.out.println("Please Enter Book Name:");
	String name = scan.next();

	System.out.println("Please enter the book added year to inventory: ");
	int Year= scan.nextInt();


	int Yearc= 2022;

	int YearDif = Yearc - Year;


	if (YearDif<10) {
	System.out.println("Book '"+name+ "' is in good condition");
	return Year;
	}

	else if (10<=YearDif && YearDif<20) {
	System.out.println("Book '"+name+ "' attention requred");
	return Year;

	}else if (20<=YearDif && YearDif<30) {
	System.out.println("Book '" +name+"' wants to rapair");
	return Year;

	}else if(30<=YearDif && YearDif<=100) {
	System.out.println( "Want to replace a book instead of '" +name+"'");
	return Year;

	}else {
	System.out.println("'"+name+ "' book is impossible !!! , '"+name+ "'added year is over than 100 years");
	return Year;
	}

	}
}
