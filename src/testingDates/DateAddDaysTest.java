package testingDates;

import org.junit.*;
import static org.junit.Assert.*;

public class DateAddDaysTest {

	//add more cases
	@Test
	public void testSameMonth() {
		
		Date date = new Date("January", 1, 1999);
		Date expected = new Date("January", 2, 1999);
		
		assertEquals(expected, date.addOneDay());
		
		Date date2 = new Date(3, 1, 2020);
		Date expected2 = new Date(3, 2, 202);
		
		assertEquals(expected2, date2.addOneDay());
	}
	
	@Test
	public void crossingMonthBoundary() {
		Date date = new Date("July",31,2000);
		Date expected = new Date("August",1,2000);
		
		assertEquals(expected, date.addOneDay());
	}
	
	@Test
	public void crossingYearBoundary() {
			Date date = new Date("December",31,1999);
			Date expected = new Date("January",1,2000);
			
			assertEquals(expected,date.addOneDay());
	}
}
