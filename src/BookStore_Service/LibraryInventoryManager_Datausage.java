package BookStore_Service;
import java.util.Scanner;

public class LibraryInventoryManager_Datausage {

	Scanner scan = new java.util.Scanner(System.in);
	
	public int LibraryInventoryManagerInternetBillChargers() {
		
		int costFordataPackage=0;	
		int total=0;
		System.out.println("Please Enter Your Name:");
		String name = scan.next();
		System.out.println("Available Data Packages:"+"\n"+"10GB Package"+"\n"+"20GB Package"+"\n"+"30GB Package"+"\n"+"40GB Package");
		System.out.println("Please Enter Your Used Data Package:");
		String dataPackage= scan.next();
		System.out.println("Please Enter Your Used Extra GB Value:");
		int extraGB= scan.nextInt();
		
		if (dataPackage.equals("10") || dataPackage.equals("10GB")) {
			costFordataPackage= 1000;
			int costForextraGB=50;
		    total =costFordataPackage+(extraGB*costForextraGB);
			System.out.println("Your Internet Bill Charges Cost Is:"+total+" Rs");
			return total;	
			}else if (dataPackage.equals("20")|| dataPackage.equals("20GB")) {
				costFordataPackage= 2000;
				int costForextraGB=50;
			    total =costFordataPackage+(extraGB*costForextraGB);
				System.out.println("Your Internet Bill Charges Cost Is:"+total+" Rs");
				return total;	
				}else if (dataPackage.equals("30") || dataPackage.equals("30GB")) {
					costFordataPackage= 3000;
					int costForextraGB=50;
				    total =costFordataPackage+(extraGB*costForextraGB);
					System.out.println("Your Internet Bill Charges Cost Is:"+total+" Rs");
					return total;	
					}else if(dataPackage.equals("40") || dataPackage.equals("40GB")) {			
						costFordataPackage= 4000;
						int costForextraGB=50;
					    total =costFordataPackage+(extraGB*costForextraGB);
						System.out.println("Your Internet Bill Charges Cost Is:"+total+" Rs");
						return total;			
			}else {
				System.out.println("Entered package is not available !!!");
					return total;
				}
	}
}
