package testmeapp.test.OnlineShoppingTest;


import static org.testng.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class calculator {
	C c;
	
	@Before
	public void setUp() throws Exception {
		c=new C();
	}

	@Test
	public void test() {
		assertEquals(10 , c.add(5, 5));
		
	}

	@Test
	public void test1() {
		assertEquals(25, c.mul(5, 5));
		
	}
}
