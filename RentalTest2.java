package rmit.sef.week8;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class RentalTest2 {
	Landlord Jef;
	Landlord Lu;
	Rental rental1;
	Rental rental2;
	Rental rental3;
	@Before
    public void setUp() throws Exception{
		 Jef = new Landlord("C001", "Jef", null);
		 Lu = new Landlord("C002", "LuLu", null);
		  rental1=new Rental("R001", "BOX HILL", "BOX HILL ST.", "BOX HILL", 4, "HOUSE",
				 Jef,  400, 48,false);
		  rental2=new Rental("R002", "Balwyn", "hHnley ST.", "Baiwyn", 2, "HOUSE",
				 Jef,  200, 48,false);
		  rental3=new Rental("R003", "Dockland", "", "Dolckland", 2, "Apartment",
				 Lu,  300, 48,false);  
		Jef.setRental(rental1);
		 Jef.setRental(rental2);
		 Lu.setRental(rental3); 
    }  
	@Test
	public void Postive() throws Exception{

		assertEquals(1344, rental1.setManageFee());
		assertEquals(1152, rental3.setManageFee());
		
	}
	@Test
	public void Negative() throws Exception{

		assertEquals(-1, rental2.setManageFee(0.05));
		assertEquals(-1, rental3.setManageFee(0.06));
		
	}
}
