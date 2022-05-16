package BookStore_Service;
import java.util.Scanner;

public class ResetPWD_LibraryInventory_Manager {

	Scanner scan = new java.util.Scanner(System.in);
	
	public String ResetPWD() {
		
		System.out.println("Please Enter Your User Name:");
		String Uname = scan.next();
		
		System.out.println("Please Enter Your Password:");
		String Password= scan.next();
		
		System.out.println("Please Enter Your New Password:");
		String New_Password= scan.next();
		
		System.out.println("Please Re Enter Your New Password:");
		String Re_Enter_New_Password= scan.next();
		
		
		if (Uname.equals("Madhushan") && Password.equals("12345") && New_Password.equals("123") && Re_Enter_New_Password.equals(New_Password)) {
			System.out.println("Password updated Successful !!!"); 
			return ("Password updated Successful !!");
		}if (Uname.equals("Madhushan") && Password.equals("12345") && New_Password.equals("123") && !Re_Enter_New_Password.equals(New_Password)) {
			System.out.println("New password and reentered new password is not matching!"); 
			return ("New password and reentered new password is not matching!");
		}
		else {
			System.out.println("Password updated Fail !!!");
			return ("Password updated Fail !!!");
		}
	}
}
