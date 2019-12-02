package ie.lyit.bank;



import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;
import java.lang.Exception;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EmployeeTest {
	private Employee e1;
	private Employee e2;

	@BeforeEach
	void setUp() throws Exception {
		e1 = new Employee(new Name("Mr","Homer", "Simpson"),new Date(1,1,1990),new Date(1,1,2009), 12000);
		
	}

	@Test
	void testToString() {
		assertEquals(e1.toString(), "Mr Homer Simpson,1/1/1990,1/1/2009,12000.0,1");
	}

	@Test
	void testEmployeeNameDateDateDouble() {
		//Check name is Homer Simpson
				assertEquals(e1.getName(), new Name("Mr","Homer", "Simpson"));
				//Check month is 0
				assertEquals(e1.getDateOfBirth(), new Date(1,1,1990));
				//Check year is 0
				assertEquals(e1.getStartDate(), new Date(1,1,2009));
				//Check year is 0
				assertTrue(e1.getSalary() == 12000);
				//fail("Not yet implemented");
	}

	@Test
	void testIncrementSalary() {
		e1.incrementSalary(200);
		assertTrue(e1.getSalary() == 12200);
		//fail("Not yet implemented");
	}
	
	@Test
	public void testIncrementSalaryError() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
		e1.incrementSalary(150000);
		});
		//assertTrue(e1.getSalary() == 12200);
		//fail("Not yet implemented");
	}

	@Test
	void testCalculateWage() {
		assertTrue(e1.calculateWage(10) == 900);
	}

	@Test
	void testSetStartDate() {
		e1.setStartDate(1,1,2010);
		assertEquals(e1.getStartDate(), new Date(1,1,2010));
		//fail("Not yet implemented");
	}

	@Test
	void testSetSalary() {
		e1.setSalary(15000);
		assertTrue(e1.getSalary() == 15000);
		//fail("Not yet implemented");
	}

}
