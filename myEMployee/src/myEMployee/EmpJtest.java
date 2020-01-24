package myEMployee;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;



public class EmpJtest {

	Employee emp1=new Employee("Mahesh");
	@Test
	public void testBonus() {
		
		Assert.assertEquals(500, emp1.getBonus(5000.0),0);
	}

}
