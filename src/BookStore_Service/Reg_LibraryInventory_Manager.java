package BookStore_Service;
import java.util.Scanner;

public class Reg_LibraryInventory_Manager {
	
	Scanner scan = new java.util.Scanner(System.in);
	
	public String Reg(String NAME,String GENDER,int AGE,String EMAIL, String PHONE) {
		
		System.out.println("Please Enter Your Name:");
		String name = scan.next();
		System.out.println("Please Enter Your Gender:");
		String gender = scan.next();
		System.out.println("Please Enter Your Age:");
		int age = scan.nextInt();
		System.out.println("Please Enter Your Email:");
		String email = scan.next();
		System.out.println("Please Enter Your Phone Number:");
		String phone = scan.next();

		//all correct
		if(NAME.matches("[a-zA-z]+([ '-][a-zA-Z]+)*") && name.equals(NAME)&& gender.equals(GENDER) && (age == AGE) && ( AGE < 70) && email.equals(EMAIL)&& 
				email.matches("^[A-Za-z0-9+_.-]+@(.+)$") && phone.equals(PHONE) && phone.matches("\\d{10}")) {
			System.out.println("Employee Registered successfully !!!"); 
			return ("Employee Registered successfully !!!");
		}
		//name validation
		if(!NAME.matches("[a-zA-z]+([ '-][a-zA-Z]+)*") && name.equals(NAME)&& gender.equals(GENDER) && (age == AGE) && ( AGE < 70) && email.equals(EMAIL)&&
				email.matches("^[A-Za-z0-9+_.-]+@(.+)$")&& phone.equals(PHONE) && phone.matches("\\d{10}")) {
				System.out.println("Employee Registration fail !!! , Please enter username in valid format !!!"); 
				return ("Employee Registration fail !!! , Please enter username with valid format !!!");
		}
		//age validation
		if(NAME.matches("[a-zA-z]+([ '-][a-zA-Z]+)*") && name.equals(NAME)&& gender.equals(GENDER) && (age == AGE) && ( AGE > 70) && email.equals(EMAIL)&&
				email.matches("^[A-Za-z0-9+_.-]+@(.+)$") && phone.equals(PHONE) && phone.matches("\\d{10}")) {
			System.out.println("Sorry, you cannot register to the system. Age should be less than 70"); 
			return ("Sorry, you cannot register to the system. Age should be less than 70");
		}	
		//email validation
		if(NAME.matches("[a-zA-z]+([ '-][a-zA-Z]+)*") && name.equals(NAME)&& gender.equals(GENDER) && (age == AGE) && ( AGE < 70) && email.equals(EMAIL)&&
				!email.matches("^[A-Za-z0-9+_.-]+@(.+)$")&& phone.equals(PHONE) && phone.matches("\\d{10}")) {
			System.out.println("Employee Registration fail !!! , Please enter email with valid format !!!"); 
			return ("Employee Registration fail !!! , Please enter email with valid format !!!");
	    }	
		//phone validation
		if(NAME.matches("[a-zA-z]+([ '-][a-zA-Z]+)*") && name.equals(NAME)&& gender.equals(GENDER) && (age == AGE) && ( AGE < 70) &&  email.equals(EMAIL)&&
				email.matches("^[A-Za-z0-9+_.-]+@(.+)$")&& phone.equals(PHONE) && !phone.matches("\\d{10}")) {
			System.out.println("Employee Registration fail !!! , Please enter phone number with valid format !!!"); 
			return ("Employee Registration fail !!! , Please enter phone with valid format !!!");
	    }	
	else {
			System.out.println("Employee Registration Fail!");
			return("Fail !!");
		}
	}
}
