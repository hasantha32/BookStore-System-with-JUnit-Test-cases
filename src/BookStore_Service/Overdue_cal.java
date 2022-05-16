package BookStore_Service;
import java.util.Scanner;

public class Overdue_cal {

	Scanner scan = new java.util.Scanner(System.in);
	
	public int OverTimeCal() {
		
		int cost=0;
		int numberofbooks=0;
		
		System.out.println("Please Enter Your Name:");
		String name = scan.next();
		
		System.out.println("Please Enter Your Overdue Dates Value: ");
		int numberofdates = scan.nextInt();
		
	
		System.out.println("Please Enter Number of Books That you were borrowed: ");
		String borrowedbooknum = scan.next();
		
		if (borrowedbooknum.equals("1")) {
			
			numberofbooks=1;
			cost= numberofbooks*numberofdates;
			System.out.println("Your want to pay: "+cost+ "rs");
			return cost;
			
			}else if (borrowedbooknum.equals("2")) {
				
				numberofbooks=2;
				cost= numberofbooks*numberofdates;
				System.out.println("Your want to pay: "+cost+"rs");
				return cost;
				
				}else if (borrowedbooknum.equals("3")) {
					
					numberofbooks=3;
					cost= numberofbooks*numberofdates;
					System.out.println("Your want to pay: "+cost+"rs");
					return cost;
					
					}else if(borrowedbooknum.equals("4")) {
						
						numberofbooks=4;
						cost= numberofbooks*numberofdates;
						System.out.println("Your want to pay: "+cost+"rs");
						return cost;
					
			}else if (borrowedbooknum.equals("5")) {
				
				numberofbooks=5;
				cost= numberofbooks*numberofdates;
				System.out.println("Your want to pay: "+cost+"rs");
				return cost;
				
				}else if (borrowedbooknum.equals("6")) {
					
					numberofbooks=6;
					cost= numberofbooks*numberofdates;
					System.out.println("Your want to pay: "+cost+"rs");
					return cost;
					
					}else if(borrowedbooknum.equals("7")) {
						
						numberofbooks=7;
						cost= numberofbooks*numberofdates;
						System.out.println("Your want to pay: "+cost+"rs");
						return cost;
					
			}else if (borrowedbooknum.equals("8")) {
				
				numberofbooks=8;
				cost= numberofbooks*numberofdates;
				System.out.println("Your want to pay: "+cost+"rs");
				return cost;
				
				}else if (borrowedbooknum.equals("9")) {
					
					numberofbooks=9;
					cost= numberofbooks*numberofdates;
					System.out.println("Your want to pay: "+cost+"rs");
					return cost;
					
					}else if(borrowedbooknum.equals("10")) {
						
						numberofbooks=10;
						cost= numberofbooks*numberofdates;
						System.out.println("Your want to pay: "+cost+"rs");
						return cost;
					
			}
		
					else {
						System.out.println("Input is invalid !!! ,please enter less than 10 for number of books");
				return numberofbooks;
			}
	}
	
}
