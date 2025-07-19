package testingDates;

import org.junit.*;
import static org.junit.Assert.*;

public class DateSetDateTest {

	@Test
	public void testingIllegalDay(){
		Date date = new Date();
		Date expected = new Date(7, 40, 2020);
		
		date.setDate(7, 40, 2020);
		assertEquals(expected,date);
	}
	
	@Test
	public void testingIllegalMonth(){
		//int
		Date date = new Date(1,1,2020);
		
		date.setDate(-1, 1, 2020);
		assertEquals(1,date.getMonth());
		
		//string
		Date date2 = new Date(1,1,2020);
		
		date2.setDate("Apple", 1, 2020);
		assertEquals(1,date2.getMonth());
	}
	
	@Test
	public void testingIllegalYear(){
		Date date = new Date(1,1,2020);
		
		date.setDate(1,1,-1);
		assertEquals(1,1,2020);
	}
	
}
