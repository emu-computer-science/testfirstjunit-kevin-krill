package testingDates;

import org.junit.*;
import static org.junit.Assert.*;

public class DateAddDaysTest {

	@Test
	public void testSameMonth() {
		
		Date date = new Date("January", 1, 1999);
		Date expected = new Date("January", 2, 1999);
		
		assertEquals(expected, date.addOneDay());
		
	}
	
}
