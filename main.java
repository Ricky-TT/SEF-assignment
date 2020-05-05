package rmit.sef.week8;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class main {

	public static void main(String[] args) {
		Landlord Jef = new Landlord("C001", "Jef", null);
		Landlord LuLu = new Landlord("C002", "LuLu", null);
		 Rental rental1=new Rental("R001", "BOX HILL", "BOX HILL ST.", "BOX HILL", 4, "HOUSE",
				 Jef,  400, 48,false);
		 Rental rental2=new Rental("R002", "Balwyn", "hHnley ST.", "Baiwyn", 2, "HOUSE",
				 Jef,  200, 48,false);
		 Rental rental3=new Rental("R003", "Dockland", "", "Dolckland", 2, "Apartment",
				 LuLu,  300, 48,false);  
		Jef.setRental(rental1);
		 Jef.setRental(rental2);
		 LuLu.setRental(rental3); 
		
		System.out.println(rental1.setManageFee());

	}

}
