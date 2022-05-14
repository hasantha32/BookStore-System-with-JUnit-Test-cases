package BookStore_Service;
import java.util.Scanner;

public class ReturnBbooksDate_counterBynumofBooks {

	Scanner scan = new java.util.Scanner(System.in);
	
	public int ReturnBooksDayCounter() {
		
		int DATES=0;
		
		System.out.println("Please Enter Your Name:");
		String name = scan.next();
		
		System.out.println("Please Enter Number of boooks you want to borrow:");
		int BOOKS= scan.nextInt();
		
		if (BOOKS<2) {
			
			DATES= 7;
			System.out.println("You want to return books after: "+DATES);
			return DATES;
			
			}else if (2<=BOOKS && BOOKS<5) {
			
				DATES= 10;
				System.out.println("You want to return books after: "+DATES);
				return DATES;
			
				}else if (5<=BOOKS && BOOKS<7) {
					
					DATES= 15;
					System.out.println("You want to return books after: "+DATES);
					return DATES;
					
					}else if(7<=BOOKS && BOOKS<=10) {
						
						DATES= 18;
						System.out.println("You want to return books after: "+DATES);
						return DATES;
						
			}else {
				System.out.println("You can't borrow over 10 books, "+BOOKS +" is not valid");
					return BOOKS;
				}
	}


	}
